import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		for(int i=0; i<n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();	
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) System.out.println("YES");
            else System.out.println("NO");
		}
	}
}