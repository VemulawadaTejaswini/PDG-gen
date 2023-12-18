import java.util.*;

public class Main {
	static char[]s;
	static char[]t;
	static int sl;
	static int tl;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		String S= sc.nextLine();
		String T= sc.nextLine();
		
		sc.close();
		
		s= S.toCharArray();
		t= T.toCharArray();
		
		
		sl= s.length;
		tl= t.length;
		
		int hit=0;
		for(int left=0;left+tl<=sl;left++){
			int temp=0;
			for(int i=0;i<tl;i++)if(s[left+ i] == t[i])temp++;
			hit= Math.max(hit, temp);	
		}
		
		System.out.println(tl-hit);
	
	}
	

}
