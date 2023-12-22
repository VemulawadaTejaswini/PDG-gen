import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		char[] tmpN = new char[N.length()];
		for(int a = 0 ; a < N.length() ; a++){
			if(N.charAt(a)=='1'){
				tmpN[a] = '9';
			}else{
				tmpN[a] = '1';
			}
		}
		String N2 = new String(tmpN);
		System.out.println(N2);
	}
}