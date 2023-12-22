import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a < b){
            if(b < c){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
        	}
        }else{
            System.out.println("No");
        }
    }
}
