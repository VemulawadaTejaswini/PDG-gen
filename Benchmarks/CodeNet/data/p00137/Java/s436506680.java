import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		for(int cases = 1;cases<=N;cases++){
			System.out.println("Case "+cases+":");
			int s = cin.nextInt();
			for(int i = 0;i<10;i++){
				s = s*s;
				String str = String.valueOf(s);
				for(int j = str.length();j< 8;j++){
					str = "0"+str;
				}
				str = str.substring(2,6);
				s = Integer.parseInt(str);
				System.out.println(s);
			}
		}
	}

}