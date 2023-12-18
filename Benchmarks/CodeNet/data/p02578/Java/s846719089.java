import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestB().doIt();
	}
	class TestB{
		void doIt() {
			int N = Integer.parseInt(sc.next());
			long ans = 0;
			long A = Long.parseLong(sc.next());
			for(int i = 1;i < N;i++) {
				long B = Long.parseLong(sc.next());
				if(B - A < 0) {
					ans = ans + (A - B);
				}else {
					A = B;
				}
			}
			System.out.println(ans);
		}
	}
}