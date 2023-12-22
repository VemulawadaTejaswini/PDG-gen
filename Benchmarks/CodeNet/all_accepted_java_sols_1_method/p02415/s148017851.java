import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
		String  t = s.substring(i, i+1);	
		if(t.matches("[a-z]")) {
				sb.append(t.toUpperCase());
			}else if(t.matches("[A-Z]")) {
				sb.append(t.toLowerCase());
			}else {
				sb.append(t);
			}
		}
		System.out.println(sb.toString());
	}
}

