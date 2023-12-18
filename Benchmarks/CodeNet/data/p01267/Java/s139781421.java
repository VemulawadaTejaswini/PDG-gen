import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			int x = stdIn.nextInt();
			if((n|a|b|c|x)==0){
				return;
			}
			int[] y = new int[n];
			for(int i=0;i<n;i++){
				y[i] = stdIn.nextInt();
			}
			int cnt = 0;
			int idx = 0;
			while(true){
				if(cnt>10000){
					System.out.println(-1);
					break;
				}
				if(x==y[idx]){
					idx++;
				}
				if(idx==y.length){
					System.out.println(cnt);
					break;
				}
				cnt++;
				int x_ = (a*x+b)%c;
				x = x_;
			}
		}
	}
}