import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int len = sc.nextInt();
			int array[] = new int[len];
			String swap[] = new String[2];
			String str;
			int temp;
			
			for(int i = 0; i < len; i++) {
				array[i] = i;
			}
			
			int cnt = sc.nextInt();
			for(int i = 0; i < cnt; i++) {
				str = sc.next();
				swap[0] = str.split(",", 2)[0];
				swap[1] = str.split(",", 2)[1];
				temp = array[Integer.parseInt(swap[0])-1];
				array[Integer.parseInt(swap[0])-1] = array[Integer.parseInt(swap[1])-1];
				array[Integer.parseInt(swap[1])-1] = temp;
				
			}
			sc.close();
			
			for(int i = 0; i < len; i++) {
				System.out.printf("%d\n", array[i]+1);
			}
	}
}
