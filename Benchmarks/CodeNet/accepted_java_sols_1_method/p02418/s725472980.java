import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		String s = scan.next();
		String ss = s + s;
		String p = scan.next();
		boolean flag = false;
		for(int i = 0; i < ss.length() - p.length(); i++){
			String div = ss.substring(i,i + p.length());
			if(div.equals(p)){
				flag = true;
				break;
			}
		}
		System.out.println(flag? "Yes" : "No");
	}
}