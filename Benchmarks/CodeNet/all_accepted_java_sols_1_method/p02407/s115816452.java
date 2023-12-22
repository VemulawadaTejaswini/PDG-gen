import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scanner.nextInt();
            }
            for(int j = n-1; j>=0; j--){
                System.out.printf("%d", a[j]);
                if(j != 0){
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
            scanner.close();
        }
         

}
