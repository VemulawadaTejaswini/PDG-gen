import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
         
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        final int n = sc.nextInt();
         
        for(int x = 1; x <= n; x++){
            if(x % 3 == 0 || (x + "").contains("3")){
                System.out.print(" " + x);
            }
        }

        System.out.println();
    
        }
 
}