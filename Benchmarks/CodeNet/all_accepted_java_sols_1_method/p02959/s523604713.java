import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //n+1個 町 n 勇者
		
		int []a = new int[n+1]; //モンスターの数
		
		int [] b = new int[n]; //倒せる
		
		for(int i = 0; i < n+1; i++) {
			a[i] = stdIn.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = stdIn.nextInt();
		}
		
		long cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] >= b[i]) {
				cnt += b[i];
			}else {
				cnt += a[i];
				int space = b[i] - a[i];
				
				if(space<= a[i+1]) {
					a[i+1] = a[i+1] - space;
					cnt += space;
					
				}else {
					cnt += a[i+1];
					a[i+1] = 0;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
