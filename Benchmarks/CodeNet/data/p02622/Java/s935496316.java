import java.util.Scanner;
public final class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int count=0;
		
		for(int i =0;i<a.length();i++) {
			if(!(a.charAt(i)==b.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
