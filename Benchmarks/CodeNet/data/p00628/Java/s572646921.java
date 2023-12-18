import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			if(str.equals("END OF INPUT")) break;
			String[] a = str.split(" ");
			StringBuilder sb = new StringBuilder(str.length());
			
			for(String t:a) {
				sb.append(t.length());
			}
			System.out.println(sb);
		}
	}
}
