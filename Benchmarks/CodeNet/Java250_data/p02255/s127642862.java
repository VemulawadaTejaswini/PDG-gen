import java.util.*;

class Main{
        static void printArray(int[] A){
                for(int i=0; i<A.length; i++){
                        System.out.print(A[i]);
                        if(i != A.length-1)
                                System.out.print(" ");
                }
                System.out.println();
        }
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int[] A = new int[N];
                for(int i=0; i<N; i++){
                        A[i] = scanner.nextInt();
                }

                for(int i=1; i<N; i++){
                        int key = A[i];
                        int j = i-1;
                        printArray(A);
                        while(j>=0 && A[j]>key){
                                A[j+1] = A[j];
                                j--;
                        }
                        A[j+1] = key;
                }
                printArray(A);
        }
}