import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int ans=0;

		if(A/2+B/2<C) {
			ans=A*X+B*Y;
		}else{
			if(X>Y){
				if(A<2*C){
					ans=Y*2*C+(X-Y)*A;
				}else{
					ans=X*2*C;
				}
			}else if(X<Y){
				if(B<2*C){
					ans=X*2*C+(Y-X)*B;
				}else{
					ans=Y*2*C;
				}
			}else if(X==Y){
				ans=2*C*X;
			}
		}

		System.out.println(ans);
				
	}
}