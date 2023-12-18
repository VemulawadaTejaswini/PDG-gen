import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		for(int i=1;i<=d-2;i++) {
	
			if(b>i*2*d&&c>b) {
				System.out.println("Yes");
				return;
			}
			if(b*2*(i+1)>a&&c>b*2*(i+1)) {
				System.out.println("Yes");
				return;
			}
			if(b>a&&c*2*(i+2)>b) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");

		

	}

}

