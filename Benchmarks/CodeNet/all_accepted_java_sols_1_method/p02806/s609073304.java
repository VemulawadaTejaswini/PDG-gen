import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //n曲
		String[] s = new String[n]; //曲名
		int[] t = new int[n]; //曲の長さ
		
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next();
			t[i] = stdIn.nextInt();
		}
		String x = stdIn.next(); //寝てしまった曲の名前
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(s[i].equals(x)) {
				for(int j = i+1; j < n; j++) {
					cnt+= t[j];
				}
				break;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
