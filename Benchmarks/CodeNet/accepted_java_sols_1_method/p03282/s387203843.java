import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		char c = '.';
		for(int i = 0; i < S.length(); i++) {
			if(i == K - 1) {
				c = S.charAt(i);
				break;
			}else if(S.charAt(i) != '1') {
				c = S.charAt(i);
				break;
			}
		}
		System.out.println(c);
	}
}