import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Stamps();
	}

	public static void Stamps() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		String[] stamps = new String[N];
		for (int i = 0; i < str.length(); i++) {
			stamps[i] = String.valueOf(str.charAt(i));
		}
		int marubatu = 0;
		int mark = 1;
		while (mark <= stamps.length-1) {
			if (!(stamps[mark - 1].equals(stamps[mark])))  {
				marubatu++;
				mark += 2;
			}
			else {
				mark++;
			}
		if(mark>stamps.length-1) {
			break;
		}
		}
        sc.close();
		System.out.println(marubatu);
	}
}

