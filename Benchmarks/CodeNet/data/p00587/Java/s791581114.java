import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String op = sc.next();
			char[] s1 = sc.next().toCharArray();
			char[] s2 = sc.next().toCharArray();

			s = "";
			int p1 = 0, p2 = 0;
			int l1 = s1.length, l2 = s2.length;
			while(p1 < l1 && p2 < l2){
				if(s1[p1] == s2[p2]){
					s += s1[p1];
					p1++;
					p2++;
				}
				else if(s1[p1] == '('){
					p1 = read(s1,p1,(op.equals("u") ? true : false));
				}
				else{
					p2 = read(s2,p2,(op.equals("u") ? true : false));
				}
			}

			if(op.equals("u")){
				while(p1 < l1) s += s1[p1++];
				while(p2 < l2) s += s2[p2++];
			}

			System.out.println(s);
		}
	}

	private static String s;

	private static int read(char[] t,int p,boolean flg){
		int level = 0;
		do{
			if(flg) s += t[p];
			if(t[p] == '(') level++;
			else if(t[p] == ')') level--;
			p++;
		}while(level != 0);
		return p;
	}
}