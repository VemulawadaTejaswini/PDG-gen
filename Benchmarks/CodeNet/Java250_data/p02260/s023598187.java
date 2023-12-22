import java.io.*;

class Main{
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        private static void swap(int[] A, int i, int j){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
        }

        private static void printArray(int[] A){
                for(int i=0; i<A.length; i++){
                        System.out.print(A[i]);
                        if(i!=A.length-1)
                                System.out.print(" ");
                }
                System.out.println();
        }

        private static int selectionSort(int[] A){
                int count = 0;
                int mini = 0;

                for(int i=0; i<A.length-1; i++){
                        boolean doswap = false;
                        mini = i;
                        for(int j=i+1; j<A.length; j++)
                                if(A[j] < A[mini]){
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
        public static void main(String[] args) throws IOException{
                int N = Integer.parseInt(br.readLine());
                String[] iline = br.readLine().split(" ");
                int[] A = new int[N];

                for(int i=0; i<N; i++)
                        A[i] = Integer.parseInt(iline[i]);

                int count = selectionSort(A);

                printArray(A);
                System.out.println(count);
        }
}