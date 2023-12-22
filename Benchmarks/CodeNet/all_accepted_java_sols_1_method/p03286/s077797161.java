import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int tmp = n;
		StringBuffer anstmp = new StringBuffer();
		if(tmp == 0)anstmp.append("0");
		while(tmp != 0) {
			int r = 0;
			if(tmp % (-2) != 0)r = 1;
			anstmp.append(String.valueOf(r));
			if(tmp < 0)tmp = (tmp - 1) /(-2);
			else tmp /= (-2);
		}
		anstmp = anstmp.reverse();
		String ans = anstmp.substring(0);
		System.out.println(ans);
	}

}
