import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t = sc.nextInt();

		int mini=-1;
		int a, b;

		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();

			if(b<=t&&(a<=mini||mini==-1)){
				mini=a;
			}
		}

		if(mini!=-1) {
			System.out.print(mini);
		}
		else {
			System.out.print("TLE");
		}



	}

}
