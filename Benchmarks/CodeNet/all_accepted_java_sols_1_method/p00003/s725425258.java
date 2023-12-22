import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		try {
			int t=scan.nextInt();
			while(t--!=0){
				int x,y,z;
				x=scan.nextInt();
				y=scan.nextInt();
				z=scan.nextInt();
				int a=x*x;
				int b=y*y;
				int c=z*z;
				if(a+b==c)
					System.out.println("YES");
				else if(b+c==a)
					System.out.println("YES");
				else if(c+a==b)
					System.out.println("YES");
				else
					System.out.println("NO");

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}