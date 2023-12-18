import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n=sc.nextLong();
		char[] s=new char[27];
		
		for(int i=0;i<26;i++) {
			s[i+1]=(char) ('a'+i);
		}
		
		ArrayList<Character> q=new ArrayList<>();
		
		while(n>0) {
			long k=n%26;
			q.add(s[(int) k]);
			n=n/26;
		}
		
		for(int i=q.size()-1;i>=0;i--) {
			System.out.print(q.get(i));
		}
		
		sc.close();
	}
}
