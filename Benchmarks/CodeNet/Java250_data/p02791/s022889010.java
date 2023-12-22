
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int c=1;
		for(int i=1;i<n;i++) {
			int a=sc.nextInt();
			if(h>=a)
				c++;
			h=Math.min(a, h);
		}
		System.out.println(c);



	}

}
