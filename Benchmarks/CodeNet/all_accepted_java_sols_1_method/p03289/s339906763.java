import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.next();

		int linelen = line.length();
		int seaC = -1;
		//boolean f = true;
		String ans = "WA";

		if(line.substring(0, 1).equals("A")) {
			//System.out.println("Aふくまれている");


			for(int i = 2; i < linelen; i++) {
				if(line.substring(i,i+1).equals("C")) {
					//System.out.println("Cが含まれている："+(i+1)+"番目");
					seaC = i;
				}
			}
			if(seaC == linelen-1) {
				seaC = -1;
			}

			if(0 < seaC) {
			line = line.replaceFirst("A", "a");
			line = line.replaceFirst("C", "c");
			//System.out.println(line);

			ans = "AC";

			for(int i = 1; i < linelen; i++) {
				if(Character.isUpperCase(line.charAt(i))) {
					//System.out.println("大文字が含まれます");
					ans = "WA";
					break;
				}
			}

			}

		}
		System.out.println(ans);

		sc.close();
	}

}
