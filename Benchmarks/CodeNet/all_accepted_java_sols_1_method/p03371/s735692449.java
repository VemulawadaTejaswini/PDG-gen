import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = a*x + b*y;
		int total = 0;
		for(int i=0; i<=x; i++){
			if(b<2*c && y>i)total = a*(x-i) + b*(y-i) + c*i*2;
			else if(b>=2*c && y>i)total = a*(x-i) + c*y*2;
			else if(y<=i)total = a*(x-i) + c*i*2;
			if(total < min)min = total;
		}
		System.out.println(min);		
	}
}