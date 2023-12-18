import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[4];
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			if(s[1].length() == 2) {
				cnt[3]++;
			}else {
				int k = s[1].charAt(0) - 'A';
				cnt[k]++;
			}
		}
		sc.close();
		for(int i : cnt) {
			System.out.println(i);
		}
	}
}
