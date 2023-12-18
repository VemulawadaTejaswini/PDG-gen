import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
  
        System.out.println(Math.max(Math.max(A+B,A-B),A*B));
    }
}