import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			int p = stdIn.nextInt();
			if(n==0&&m==0&&p==0){
				return;
			}
			int h = 0;
			int w = 0;
			for(int i=1;i<=n;i++){
				int tmp = stdIn.nextInt();
				h += tmp;
				if(m==i){
					w = tmp;
				}
			}
			int ans = h*100;
			ans = ans*(100-p)/100;
			if(w!=0){
				ans /= w;
			}
			else{
				ans = 0;
			}
			System.out.println(ans);
		}
	}
}