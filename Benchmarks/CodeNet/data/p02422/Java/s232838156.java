import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String str = scan.next();
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			String com = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(com.equals("print")){
				String out = str.substring(a, b);
				System.out.println(out);
			} else if(com.equals("reverse")){
				StringBuffer sb = new StringBuffer();
				String s1 = str.substring(0, a);
				String div = str.substring(a, b + 1);
				String s2 = str.substring(b + 1);
				for(int j = b; j >= a; j--){
					char ch = str.charAt(i);
					sb.append(ch);
				}
				div = sb.toString();
				StringBuffer sb2 = new StringBuffer();
				sb2.append(s1).append(div).append(s2);
				str = sb2.toString();
				
			} else if(com.equals("replace")){
				String p = scan.next();
				String s1 = str.substring(0, a);
				String s2 = str.substring(b + 1);
				StringBuffer sb = new StringBuffer();
				sb.append(s1).append(p).append(s2);
				str = sb.toString();
			}
		}
	}
}