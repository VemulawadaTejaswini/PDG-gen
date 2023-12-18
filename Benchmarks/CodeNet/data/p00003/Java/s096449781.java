import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c,max;
		for(int i=0; i<n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();	
			if(a>b){
				max=a;
				a=b;
				b=max;
			}
			if(b>c){
				max=b;
				c=max;
				b=c;
			}
			if(a*a+b*b==c*c){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}