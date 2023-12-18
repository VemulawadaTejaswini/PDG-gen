import java.util.Scanner;

public class Main {

	void main() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equals("0")) break;
			int l = str.length();
			int sum = 0;
			for(int i=0;i<l;i++) {
				char c = str.charAt(i);
				sum += c - '0';
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		new Main().main();
	}

}



