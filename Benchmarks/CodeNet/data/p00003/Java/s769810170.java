import java.util.Scanner;
public class RigthAngle {
	
	
	public static int Func(int a,int b,int c){
		
		if(a*a==b*b+c*c){
			return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		
		int TestCase=sc.nextInt();
		
		for (int i = 1; i <= TestCase; i++) {
			
			int ans=0;
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if(a>b && a>c) {
				ans=Func(a,b,c);
			}
			else if(b>c && b>a) {
				ans=Func(b,a,c);
			}
			else if(c>b && c>a) {
				ans=Func(c,a,b);
			}
			
			if(ans==1) System.out.println("YES");
			
			else System.out.println("NO");
		}

	}
    

}