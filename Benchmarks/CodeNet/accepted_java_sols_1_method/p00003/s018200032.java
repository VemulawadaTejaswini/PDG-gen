import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
				for(int i=0; i<N; i++)
				{
					int a = sc.nextInt();
					int b = sc.nextInt();
					int c = sc.nextInt();
						if(a>b && a>c){
							if(a*a == b*b + c*c){
								System.out.println("YES");
							} else System.out.println("NO");
						} else if(b>a && b>c){
							if(b*b == a*a + c*c){
								System.out.println("YES");
							} else System.out.println("NO");
						} else if(c>a && c>b){
							if(c*c == a*a + b*b){
								System.out.println("YES");
							} else System.out.println("NO");
						} else System.out.println("NO");
				}
		}
}