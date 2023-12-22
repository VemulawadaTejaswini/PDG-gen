import java.util.*;
public class Main {
	public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a * b;
        
        if(c % 2 == 1) {
            System.out.println("Odd");
        }else if(c % 2 == 0) {
            System.out.println("Even");
        }
    }
}