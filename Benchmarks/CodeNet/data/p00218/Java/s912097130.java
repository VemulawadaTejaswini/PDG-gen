import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			while(n-- > 0){
				int c = sc.nextInt();
				int b = sc.nextInt();
				int a = sc.nextInt();
				int ave = (a + b + c) / 3;
				if(a == 100 || b == 100 || c == 100){
					System.out.println("A");
				}
				else if((b + c) / 2 >= 90){
					System.out.println("A");
				}
				else if(ave >= 80){
					System.out.println("A");
				}
				else if(ave >= 70){
					System.out.println("B");
				}
				else if(ave >= 50 && (b >= 80 || c >= 80)){
					System.out.println("B");
				}
				else{
					System.out.println("C");
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}