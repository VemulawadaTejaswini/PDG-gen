import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt(); //500円の枚数
		int b = stdIn.nextInt(); //100円の枚数
		int c = stdIn.nextInt(); //50円の枚数
		int x = stdIn.nextInt(); 
		int cnt = 0;
		
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int k = 0; k <= c; k++) {
					if(x == (i*500)+(j*100)+(k*50)) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
		
		
	}

}
