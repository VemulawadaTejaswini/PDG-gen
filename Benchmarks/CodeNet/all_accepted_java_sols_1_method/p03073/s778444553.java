import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] ss = s.split("");
		int count = 0;
		for(int i=1; i<ss.length; i++) {
			if(ss[i].equals(ss[i-1])) {
				count++;
				if(ss[i].equals("0"))
					ss[i] = "1";
				else
					ss[i]  = "0";

			}
		}
		System.out.println(count);
	}

}
