import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String b = scan.next();
		char c[] = b.toCharArray();

		scan.close();

		int count = 0;

		for(int i=0;i<3;i++) {
			if(c[i]=='R') {
				count++;
			}
		}

		if(count==3) {
			System.out.println("3");
		}else if(count==1) {
			System.out.println("1");
		}else if(count==2){
			if(c[1]=='S') {
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}else {
			System.out.println("0");
		}
	}

}
