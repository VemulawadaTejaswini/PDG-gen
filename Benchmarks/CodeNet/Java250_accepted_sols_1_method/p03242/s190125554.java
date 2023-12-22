import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argv){
		String s = scan.next();
		char[] c = s.toCharArray();
		for(int i=0;i < c.length;i++){
			if(c[i]=='1')
				c[i] = '9';
			else
				c[i] = '1';
		}
		System.out.println(String.valueOf(c));
	}
}