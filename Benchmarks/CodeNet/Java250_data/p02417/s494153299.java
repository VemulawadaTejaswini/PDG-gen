import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			char array[] = new char[1200], cnt = 0;
			int code[] = new int['z'-'a'+1];
			String str;
			
			while(sc.hasNext()) {
				str = sc.next();
				for(int j = 0; j < str.length(); j++) {
					array[cnt] = str.charAt(j);
					cnt++;
				}
			}
			sc.close();
			
			for(int i = 0; i < cnt; i++) {
				if(array[i] <= 90 && array[i] >= 65) {
					array[i] += 'a' - 'A';
				}
				
				if(array[i] >= 97 && array[i] <= 122) {
					code[(int) array[i] - 97]++;
				}
			}
			
			for(int i = 0; i < 'z'-'a'+1; i++) {
				System.out.printf("%c : %d\n", 97+i, code[i]);
			}
		}
}
