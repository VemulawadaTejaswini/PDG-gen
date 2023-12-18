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
				String out = str.substring(a, b + 1);
				System.out.println(out);
			}
			if(com.equals("reverse")){
				String top = str.substring(0, a);
				String bottom = str.substring(b + 1);
				StringBuffer sb = new StringBuffer();
				for(int j = b; j >= a; j--){
					char ch = str.charAt(j);
					sb.append(ch);
				}
				String r = sb.toString();
				StringBuffer sb2 = new StringBuffer();
				sb2.append(top).append(r).append(bottom);
				str = sb2.toString();
			}
			if(com.equals("replace")){
				String p = scan.next();
				String top = str.substring(0, a);
				String bottom = str.substring(b + 1);
				StringBuffer sb = new StringBuffer();
				sb.append(top).append(p).append(bottom);
				str = sb.toString();
			}
		}
	}
}