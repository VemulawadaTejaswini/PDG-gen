import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String t=sc.next();
		
		//char n=t.charAt(0);
		//t.substring(t.length() - 切り出したい文字列の長さ);
				
		if(t.length()==s.length()+1&&t.indexOf(s)==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
	sc.close();
	}

}
