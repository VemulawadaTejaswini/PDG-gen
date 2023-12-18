
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=-1;
		Scanner sc=new Scanner(System.in);

		int ab=sc.nextInt();
		int bc=sc.nextInt();
		int ca=sc.nextInt();

		if(ab*ab+bc*bc==ca*ca) {
			ans=ab*bc/2;
		}

		System.out.println(ans);
	}
	

}
