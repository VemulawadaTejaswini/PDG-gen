import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int h, m, cnt = 0;
			String array[] = new String[10];
			String temp;
			String str;
			
			for(int i = 0; i < 10; i++) {
				str = sc.next();
				if(str.equals("-")) {
					break;
				}
				array[i] = str;
				m = sc.nextInt();
				for(int j = 0; j < m; j++) {
					h = sc.nextInt();
					temp = array[i].substring(0, h);
					array[i] = array[i].substring(h);
					array[i] = array[i].concat(temp);
				}
				cnt++;
			}
			sc.close();
			
			for(int i = 0; i < cnt; i++) {
				System.out.println(array[i]);
			}
		}
}
