//Volume2-0208
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int    n;
		char[] ch;
		String ans;
		String[] map   = {"0","1","2","3","5","7","8","9"};

		while((n = sc.nextInt())!=0){
			ans = "";
			ch = Integer.toOctalString(n).toCharArray();
			for(int i=0;i<ch.length;i++){
				ans += map[Character.digit(ch[i], 10)];
			}
			System.out.println(ans);
		}
	}
}