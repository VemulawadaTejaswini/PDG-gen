import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		int count=0;
		long total=0;
			for(int i=c.length-1;i>=0;--i) {
				if(c[i]=='B') {
					total+=c.length-1-i-count;
					++count;
				}
			}
		
		System.out.println(total);
	}
}
