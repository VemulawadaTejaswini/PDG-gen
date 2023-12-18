import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void sort(int[] A) {
        int i, j, tmp;
        for (i = 1; i < A.length; i++) {
            tmp = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > tmp) {
                A[j + 1] = A[j];
                j--;
            }
        A[j + 1] = tmp;
        printArray(A);
        }
    }
    
    public static void printArray(int[] A) {
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] s = str.split(" ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(s[i]);
        }
        
        printArray(array);
        sort(array);
        
    }
}
