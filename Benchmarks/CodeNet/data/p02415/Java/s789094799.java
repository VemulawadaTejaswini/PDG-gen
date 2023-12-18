import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String str;
			int chara = 0;
			int flag = 0;
			while(sc.hasNext()) {
				if(flag != 0) {
					System.out.printf(" ");
				} else {
					flag = 1;
				}
				str = sc.next();
				for(int j = 0; j < str.length(); j++) {
					chara = str.charAt(j);
					if(chara >= 'a' && chara <= 'z') {
						chara -= 'a' - 'A';
					} else if(chara >= 'A' && chara <= 'Z') {
						chara -= 'A' - 'a';
					}
					System.out.printf("%c", chara);
				}
			}
			sc.close();
		
			System.out.println();
	}
}
