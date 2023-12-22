import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] A = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++){
                A[i] = scanner.nextInt();
            }
            boolean flag = true;
            while(flag){
                flag = false;
                for(int j = n-1; j > 0; j--){
                    if(A[j] < A[j-1]){
                        int temp = A[j];
                        A[j] = A[j-1];
                        A[j-1] = temp;
                        flag = true;
                        count ++;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                System.out.printf("%d", A[i]);
                if(i != n-1){
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n%d\n", count);
            scanner.close();
        }
         

}
