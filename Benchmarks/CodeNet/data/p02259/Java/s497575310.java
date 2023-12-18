import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" " , n);
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(input[i]);
        }

        insertionSort(array);
    }

    static void printArray(int[] A){
    	StringBuilder sb = new StringBuilder();
        for(int k : A){
            sb.append(k + " ");
        }
        System.out.println(sb.toString().substring(0 , sb.length() - 1));
    }

    static void insertionSort(int[] A){
    	int count=0;
        for(int i=0; i<A.length; i++){
        	for(int j=A.length-1; j>i; j--){
        		if(A[j]<A[j-1]){
        			int k = A[j];
        			A[j] = A[j-1];
        			A[j-1] = k;
        			count++;
        		}
        	}
        }
        printArray(A);
        System.out.println(count);
    }
}

