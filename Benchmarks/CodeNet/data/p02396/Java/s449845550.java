import java.util.Scanner;
 
public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
         
        while(true){
            int n = scan.nextInt();
             
            if(n == 0) break;
             
            System.out.println("Case " + i++ + ": " + n);
        }
    }
}