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
			String S = sc.next();
			String T = sc.next();
			char SubT[] = T.toCharArray();
			int lengthS = S.length();
			int lengthT = T.length();
			int length = lengthS - lengthT;
			int min = 10000;
			for(int i = 0;i <= length;i++){
//				System.out.println(S.substring(i,i + lengthT));
				char SubS[] = S.substring(i,i + lengthT).toCharArray();
				int count = 0;
				for(int j = 0;j < lengthT;j++) {
					if(SubS[j] != SubT[j]) {
						count++;
					}
				}
				min = Math.min(min,count);
			}
			System.out.println(min);
		}
	}
}