import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
	
			if(b>a*2||c>b) {
				System.out.println("Yes");
				return;
			}
			if(b*2>a||c>b*2) {
				System.out.println("Yes");
				return;
			}
			if(b>a||c*2>b) {
				System.out.println("Yes");
				return;
			}
			
		
		System.out.println("No");


	}

}

