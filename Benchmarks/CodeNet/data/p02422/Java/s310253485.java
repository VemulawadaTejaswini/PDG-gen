import java.util.*;

public class Main36{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String s1, s2;
		int q = scan.nextInt();
		int len = str.length();
		for(int i = 0; i < q; i++){
			String com = scan.next();
			if(com.equals("print")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				s1 = str.substring(a, b + 1);
				System.out.println(s1);
			}
			if(com.equals("reverse")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				s1 = str.substring(0, a);
				s2 = str.substring(b + 1, len);
				StringBuffer sb = new StringBuffer();
				for(int j = b; j >= a; j--){
					sb.append(str.charAt(j));
				}
				str = s1 + sb + s2;
			}
			if(com.equals("replace")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				String p = scan.next();
				s1 = str.substring(0, a);
				s2 = str.substring(b + 1);
				str = s1 + p + s2;
			}
		}
	}
}