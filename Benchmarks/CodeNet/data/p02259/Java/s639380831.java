
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
        }
        printList(A,N);
        bubbleSort(A,N);
    }
     
    static void bubbleSort(int[] A,int N){
        for(int i=N-1;i>0;i--){
        	//[N-1-i] is better than 0
        	for(int j=N-1;j>N-1-i;j--){
        		if(A[j-1] > A[j]){
        			int v = A[j];
        			A[j] = A[j-1];
        			A[j-1] = v;
        		}
        	}
        	printList(A,N);
        }
    }
    static void printList(int[] A,int N){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<N;i++){
            if(i>0){
                builder.append(" ");
            }
            builder.append(A[i]);
        }
        System.out.println(builder);
    }
}