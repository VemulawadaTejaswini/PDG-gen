import java.util.*;
		
public class Main{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int N = 0;
			int x = 0;
			int y = 0;
			int b = 0;
			int p = 0;
			int f;
			int a;
			N = scan.nextInt();
			for(int i=0;i<N;i++){
				x = scan.nextInt();
				y = scan.nextInt();
				b = scan.nextInt();
				p = scan.nextInt();
				f = x * b + y * p;
				if(b < 5 && p < 2){
					a = f;
					System.out.println(a);
				}else
				if(b >= 5 && p >= 2){
					f = (x * b + y * p) * (8 / 10);
					a = f;
					System.out.println(a);
				}else
				if(b >= 5 && p < 2){
					f = (x * b + y * 2) * (8 / 10);
					a = f;
					System.out.println(a);
				}else
				if(b < 5 && p >= 2){
					f = (x * 5 + y * p) * (8 / 10);
					a = f;
					System.out.println(a);
				}
			}
	}
}