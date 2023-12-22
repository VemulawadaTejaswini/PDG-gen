import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int count=0;
		int ans=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				count++;
			}else {
				ans++;
			}
		}
		int r=Math.min(count,ans)*2;
		System.out.println(r);
		sc.close();
	}

}