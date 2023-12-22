import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new A().doIt();
		new B().doIt();
//		new C().doIt();
//		new D().doIt();
	}
	class A{
		void doIt() {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int h = sc.nextInt();
			System.out.println((a + b)*h/2);
		}
	}
	class B{
		void doIt() {
			String A = sc.next();
			String B = sc.next();
			String C = sc.next();
			
			char Ac[] = A.toCharArray();
			char Bc[] = B.toCharArray();
			char Cc[] = C.toCharArray();
			
			int AL = A.length();
			int BL = B.length();
			int CL = C.length();
			
			System.out.println(Battle(Ac,Bc,Cc,AL,BL,CL));
		}
		String Battle(char Ac[],char Bc[],char Cc[],int AL,int BL,int CL) {
			int a = 0,b = 0,c = 0;
			char start = 'a';
			while(true) {
				if(start == 'a') {
					a++;
					if(a == AL+1)return "A";
					start = Ac[a-1];
				}else if(start == 'b') {
					b++;
					if(b == BL+1)return "B";
					start = Bc[b-1];
				}else {
					c++;
					if(c == CL+1)return "C";
					start = Cc[c-1];
				}
			}
		}
	}
}
