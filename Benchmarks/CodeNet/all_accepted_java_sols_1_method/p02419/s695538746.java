import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String P = scanner.next().toLowerCase();
		char p[] = P.toCharArray();

		String tmp;
		int ans = 0;
		boolean FLG;

		while(!(tmp = scanner.next()).equals("END_OF_TEXT")){

			char line[] = tmp.toLowerCase().toCharArray();

			if(line.length != p.length)continue;

			FLG = true;
			for(int i = 0; i < P.length(); i++){
				if(p[i] != line[i]){
					FLG = false;
					break;
				}
			}
			if(FLG)ans++;
		}

		System.out.println(ans);
	}
}
