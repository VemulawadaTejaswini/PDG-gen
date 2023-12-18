import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestC().doIt();
	}
	class TestC{
		void doIt() {
			int N = sc.nextInt();
			long A = 0;
			long B = 0;
			long MOD = 1000000007;
			long ans = 0;
			for(int i = 0;i < N;i++) {
				A = Long.parseLong(sc.next());
				if(i > 0) {
					ans = (ans + A * B) % MOD;
				}
				B = (B + A) % MOD;
			}
			System.out.println(ans);
		}
	}
}