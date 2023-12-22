import java.util.Scanner;

public class Main {
	public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int c = 1;
        
        while(true){
            int n = scan.nextInt();
            
            if(n == 0) break;
            
            System.out.println("Case " + c++ + ": " + n);
        }
    }
}