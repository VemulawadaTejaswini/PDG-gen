import java.util.Scanner;


public class Main {
    static   Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {    
        int n = scan.nextInt();
        int [] array1 = new int[n];
            for (int i = 0; i < n; i++) {
                array1[i] =scan.nextInt();
        }
            for (int i = n-1; i >= 0; i--) {
                System.out.print(array1[i]);
                if (i>0) {
                    System.out.print(" ");
                }
        }System.out.println();
            
    }
}
