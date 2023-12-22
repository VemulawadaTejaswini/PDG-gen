import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		int cnt  = 1;
		char p = s.charAt(0);
		
		for(int i=1;i<s.length();i++){
			if(s.charAt(i) != p){
				cnt++;
				p = s.charAt(i);
			}
		}
		System.out.println(cnt);
	}

}
