import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		int kekka=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i)){
				kekka+=1;
			}
		}
		System.out.println(kekka);
	}
}
