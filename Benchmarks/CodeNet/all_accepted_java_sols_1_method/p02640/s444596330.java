import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((b-2*a)%2==0&&4*a-b>=0&&b>=2*a) {
			System.out.println("Yes"); 
		}else {
			System.out.println("No");
		}
		

	}

}
