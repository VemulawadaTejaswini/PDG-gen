import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String k = scan.next();
		scan.close();

		for(int i=0;i<s.length();i++) {
			if(Character.getNumericValue(s.charAt(i))==1) {
				if(k.length()<=3) {
					int K = Integer.valueOf(k);
					if(K-1 == i) {
						System.out.println("1");
						break;
					}
				}
			}else {
				System.out.println(Character.getNumericValue(s.charAt(i)));
				break;
			}
		}
	}

}