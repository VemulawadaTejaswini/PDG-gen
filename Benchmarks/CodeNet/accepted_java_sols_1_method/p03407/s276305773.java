import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        if((A+B)>=C) {
        	System.out.print("Yes");
        }	
        else {
        	System.out.print("No");
        }
    }
}