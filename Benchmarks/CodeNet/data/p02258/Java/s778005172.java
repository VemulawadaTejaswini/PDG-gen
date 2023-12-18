import java.util.*;
class Donyuu{
	void aaaa(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int y;
		int min=200000;
		int x=-200000;
		for(int i=0;i<N;i++){
			y=sc.nextInt();
			if(y-min>x)x=y-min;
			if(min>y)min=y;
		}
		System.out.println(x);
	}
	public static void main(String[]arg){
		Donyuu dn=new Donyuu();
		dn.aaaa();
	}
}