import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String[] s = st.split("");
		int count01 = 0; int  count10 = 0; boolean sw = true;
		for(String a: s) {
			if(sw) {
				if(a.equals("0"))count01++;
				if(a.equals("1"))count10++;
			}else {
				if(a.equals("1"))count01++;
				if(a.equals("0"))count10++;
			}
			sw = !sw;
		}
		System.out.println(Math.min(count01,count10));

		sc.close();
	}
}