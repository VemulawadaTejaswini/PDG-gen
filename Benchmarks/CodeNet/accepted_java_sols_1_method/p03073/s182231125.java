import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String [] str = s.split("");
		int[] n = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			n[i] = Integer.parseInt(str[i]);
		}
		int cnt = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (n[i] == n[i+1]) {
				cnt++;
				if(n[i+1] == 0){
					n[i+1] = 1;
				}else{
					n[i+1] = 0;
				}
			}
		}
		System.out.println(cnt);
	}
}