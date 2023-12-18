import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int cnt = 0;
			for(int i=1;i<=n/2;i++){
				int s = 0;
				for(int j=i;;j++){
					s += j;
					if(s==n){
						cnt++;
					}
					else if(s>n){
						break;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}