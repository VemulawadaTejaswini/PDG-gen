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
			String str = sc.next();
			int length = str.length();
			int ans = 0;
			for(int i = 0;i < length;i++) {
				ans = ans + Integer.parseInt(str.substring(i,i+1));
			}
			if(ans % 9 == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}