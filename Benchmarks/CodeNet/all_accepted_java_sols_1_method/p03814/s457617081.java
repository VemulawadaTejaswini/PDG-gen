import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		int idxA = 0;
		for(int i = 0;i < s.length();++i) {
			if(s.charAt(i) == 'A') {
				idxA = i;
				break;
			}
		}
		
		int idxZ = s.length()-1;
		for(int i = s.length()-1;i >= 0;--i) {
			if(s.charAt(i) == 'Z') {
				idxZ = i;
				break;
			}
		}
		
		System.out.println((idxZ - idxA + 1));
	}
}
