import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;    //n组数据
		int a,b,c;    //3条边的边长
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
