import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=-1;
	void g(){
		while(true){
		int n=sc.nextInt();
		if(n==0)break;
			for(int i=0; i<n; i++){
				int p=sc.nextInt();
				int d1=sc.nextInt();
				int d2=sc.nextInt();
				int max=d1+d2;
				if(b<max){
					a=p;
					b=d1+d2;
				}
			}
			System.out.println(a+" "+b);
		}
	}
		
		
		
	public static void main(String[]agrs){
		new Main().g();
	}
}