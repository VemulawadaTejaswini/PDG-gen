import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String a = "777777777";
		int b = -1;
		for(int i=1; i<a.length(); i++) {
			String s = a.substring(0,i);
			int c = Integer.parseInt(s);
			if(c%K==0) {
				b = i;
				break;
			}
		}
		sc.close();
		System.out.println(b);
	}

}