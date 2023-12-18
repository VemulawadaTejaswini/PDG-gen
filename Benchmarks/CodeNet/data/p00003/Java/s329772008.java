import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0,c=0;
		for(int i=0;i<n;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(a>b&&a>c){
				if(Math.pow(a, 2)==Math.pow(c, 2)+Math.pow(b, 2))
					System.out.println("YES");
				else System.out.println("NO");
			}else if(b>c&&b>a){
				if(Math.pow(b, 2)==Math.pow(c, 2)+Math.pow(a, 2))
					System.out.println("YES");
				else System.out.println("NO");
			}else if(c>b&&c>a){
				if(Math.pow(c, 2)==Math.pow(a, 2)+Math.pow(b, 2))
					System.out.println("YES");
				else System.out.println("NO");
			}else System.out.println("NO");
		}
	}
}