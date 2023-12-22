import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] c = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String cc = sc.next();
		for(int i = 0;i < c.length-1;i++) {
			if(cc.equals(c[i])) {
				System.out.println(c[i+1]);
				break;
			}
		}
	}

}