import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int p = in.nextInt();
			int xm = 0;
			if(n == 0) break;
			int sum = 0;
			for(int i=0; i<n; i++){
				int x = in.nextInt();
				sum += x;
				if(i+1==m) xm = x;
			}
			int res = xm==0?0:(sum*(100-p))/xm;
			System.out.println((int)res);
		}
	}
}