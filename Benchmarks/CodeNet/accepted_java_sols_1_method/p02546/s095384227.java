import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		String S= sc.nextLine();
		sc.close();
		
		char[]s= S.toCharArray();
		
		int  size= s.length;
		String ans;
		if(s[size-1] != 's')ans= S+ "s";
		else ans= S+ "es";
		
		System.out.println(ans);
				
	}

}
