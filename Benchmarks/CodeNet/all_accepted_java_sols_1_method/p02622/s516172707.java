import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		int ans=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i)) ans++;
		}
		
		System.out.println(ans);

	}

}
