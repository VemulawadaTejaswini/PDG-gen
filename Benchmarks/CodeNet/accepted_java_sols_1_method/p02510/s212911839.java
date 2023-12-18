import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			if(s.equals("-")) break;
			int m = sc.nextInt();
			for(int i = 0; i < m; i++){
				int h = sc.nextInt();

				String s2 = s.substring(h,s.length())+s.substring(0,h);
				s = s2;
			}
			System.out.println(s);
		}
	}
}