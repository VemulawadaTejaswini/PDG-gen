import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String s = sc.next();
			while(n-- > 0){
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < s.length();){
					char num = s.charAt(i);
					int count = 0;
					while(i < s.length() && num == s.charAt(i)){
						count++;
						i++;
					}
					sb.append(count + "" + num);
				}
				s = sb.toString();
			}
			System.out.println(s);
		}
	}

	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}