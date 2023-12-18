import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.nextLine();
			StringBuffer ans = new StringBuffer();
			int p = 0;
			for(int i=0;i<s.length();i++){
				p = s.codePointAt(i);
				if(p>96 && p<123)p-=32;
				ans.append((char)p);
			}
			System.out.println(ans.toString());
			
		}
	}	
}