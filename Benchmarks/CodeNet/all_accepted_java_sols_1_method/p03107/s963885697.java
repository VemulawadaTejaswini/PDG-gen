import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String qube = scan.next();
		char[] mozi = qube.toCharArray();

		int count0 = 0;
		int count1 = 0;

		for(int i=0;i<qube.length();i++) {
		if(mozi[i] == '0') {
			count0++;
		}else {
			count1++;
		}
		}

		System.out.println(Math.min(count0, count1)*2);
		scan.close();

	}

}
