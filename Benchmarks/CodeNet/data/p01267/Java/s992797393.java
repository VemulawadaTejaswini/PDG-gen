import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int x = in.nextInt();
			if(n == 0) break;
			int count = 0;
			boolean cont = true;
			for(int i=0; i<n; i++){
				int y = in.nextInt();
				while(cont && y != x){
					x = next(x, a, b, c);
					count++;
					if(count > 10000){
						cont = false;
					}
				}
				x = next(x, a, b, c);
				if(i<n-1) count++;
			}
			System.out.println(count > 10000 ? -1 : count);
		}
	}
	
	public static int next(int x, int a, int b, int c){
		return (x*a+b)%c;
	}
}