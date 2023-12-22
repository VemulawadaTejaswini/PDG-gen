import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int m = Math.max(a,b);
                m = Math.max(b,c);
		if(m==a){
			for(int i=0; i<k; i++){
				a = 2*a;
			}
		}
		else if(m==b){
			for(int i=0; i<k; i++){
				b = 2*b;
			}
		}
		else if(m==c){
			for(int i=0; i<k; i++){
				c = 2*c;
			}
		}
		System.out.println(a+b+c);
	}
}