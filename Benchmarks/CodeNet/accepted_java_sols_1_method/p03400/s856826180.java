import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //参加者
		int d = stdIn.nextInt(); //日数
		int x = stdIn.nextInt(); //残ったチョコレートの数
		int [] a = new int[n]; //
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		int cnt = n;
		for(int i = 0; i < n; i++) {
			int num = 1;
			while(true) {
				if(num+a[i] <= d) {
					num+= a[i];
					cnt++;
				}else {
					break;
				}
				
			}
			
			
		}
		
		System.out.println(cnt+x);
		
		
	}

}
