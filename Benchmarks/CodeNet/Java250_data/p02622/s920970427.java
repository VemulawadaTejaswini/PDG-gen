import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int diff = 0;
		
		String[] ss = s.split("");
		String[] tt = t.split("");
		
		for(int i=0;i<ss.length;i++) {
			if(ss[i].equals(tt[i])) {
			}else {
				diff++;
			}
		}
		
		System.out.println(diff);

	}
}