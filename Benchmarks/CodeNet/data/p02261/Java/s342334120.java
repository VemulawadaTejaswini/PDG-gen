import java.io.*;

class Main{
         private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        private static void swap(String[] A, int i, int j){
                String tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
        }

        private static void printArray(String[] A){
                for(int i=0; i<A.length; i++){
                        System.out.print(A[i]);
                        if(i!=A.length-1)
                                System.out.print(" ");
                }
                System.out.println();
        }

        private static int getNum(String s){
                return Integer.parseInt(s.substring(1));
        }

        private static int bubbleSort(String[] A){
                int count = 0;
                for(int i=0; i<A.length; i++){
                        for(int j=A.length-1; j>i; j--)
                                if(getNum(A[j])<getNum(A[j-1])){
                                        swap(A, j, j-1);
                                        count++;
                                }

                }
                return count;
        }

        private static int selectionSort(String[] A){
                int count = 0;
                int mini = 0;

                for(int i=0; i<A.length-1; i++){
                        boolean doswap = false;
                        mini = i;
                        for(int j=i+1; j<A.length; j++)
                                if(getNum(A[j]) < getNum(A[mini])){
                                        mini = j;
                                        doswap = true;
                                }
                        if(doswap){
                                swap(A, i, mini);
                                count++;
                        }
                }
                return count;
        }

        private static boolean isStable(String[] A, String[] B){
                boolean stable = true;
                for(int i=0; i<A.length; i++){
                        if(!A[i].equals(B[i])){
                                stable = false;
                                break;
                        }
                }
                return stable;
        }

        public static void main(String[] args) throws IOException{
                int N = Integer.parseInt(br.readLine());
                String[] bubble = br.readLine().split(" ");
                String[] select = bubble.clone();
                bubbleSort(bubble);
                selectionSort(select);
                printArray(bubble);
                System.out.println("Stable");
                printArray(select);
                if(isStable(bubble, select))
                        System.out.println("Stable");
                else
                        System.out.println("Not stable");
        }
}