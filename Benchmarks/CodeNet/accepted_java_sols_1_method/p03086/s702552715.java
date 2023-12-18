
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = 0;
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
				count++;
				if(result < count) {
					result = count;
				}
			}else {
				count = 0;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
