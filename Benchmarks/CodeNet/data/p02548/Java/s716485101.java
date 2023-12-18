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
			int N = sc.nextInt();
			int cnt = 0;
			for(int i = 1;i < N;i++) {
				for(int j = 1;j <= i;j++) {
					int k = i / j;
					if(j > k)break;
					if(i % j != 0)continue;
					if(j == k)cnt++;
					else {
						cnt += 2;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}