import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean yes = false;
		for(int i = 0;i<n;i++){
			yes = false;
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if(((x*x)+(y*y))==(z*z)) yes = true;
			else if(((z*z)+(y*y))==(x*x)) yes = true;
			else if(((x*x)+(z*z))==(y*y)) yes = true;
			
			if(yes) System.out.println("YES");
			else System.out.println("NO");
		}
 	}

}