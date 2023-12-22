import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0) {
			String s1 = in.next();
			String s2 = in.next();
			if(s1.length()>80||s2.length()>80) {
				System.out.println("overflow");
				continue;
			}
			StringBuffer s = new StringBuffer(s1);
			s1 = s.reverse().toString();
			s = new StringBuffer(s2);
			s2 = s.reverse().toString();
			Stack<Integer> stack = new Stack<>();
			int a=0,b=0;    //每一位上的数字
			int flag=0;    //标记进位
			if(s1.length()<s2.length()) {
				String t = s1;
				s1 = s2;
				s2 = t;
			}
			for(int i=0;i<s1.length();i++) {
				switch(s1.charAt(i)) {
				case '0' : a = 0; break;
				case '1' : a = 1; break;
				case '2' : a = 2; break;
				case '3' : a = 3; break;
				case '4' : a = 4; break;
				case '5' : a = 5; break;
				case '6' : a = 6; break;
				case '7' : a = 7; break;
				case '8' : a = 8; break;
				case '9' : a = 9; break;
				}
				if(s2.length()<=i)
					b=0;
				else {
					switch(s2.charAt(i)) {
					case '0' : b = 0; break;
					case '1' : b = 1; break;
					case '2' : b = 2; break;
					case '3' : b = 3; break;
					case '4' : b = 4; break;
					case '5' : b = 5; break;
					case '6' : b = 6; break;
					case '7' : b = 7; break;
					case '8' : b = 8; break;
					case '9' : b = 9; break;
					}
				}
				if(a+b+flag>9) {
					stack.add(a+b+flag-10);
					flag=1;
				}
				else {
					stack.add(a+b+flag);
					flag = 0;
				}
			}
			if(flag==1)
				stack.add(flag);
			if(stack.size()>80)
				System.out.println("overflow");
			else {
				while(!stack.isEmpty()) {
					int c = stack.pop();
					System.out.print(c);
				}
				System.out.println();
			}
		}
		in.close();
	}
}
