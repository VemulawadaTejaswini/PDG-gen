import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		int tmp;
		String ans = "";
		while (N > 0){
			N-=1;
			tmp = (int) (N % 26);
			ans += (char)(tmp + 'a');
			N /= 26;
		}
		for(int i=ans.length();i>0;--i){
			System.out.print(ans.charAt(i-1));
		}
	}
}
