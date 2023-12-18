import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		int tmp = (int)(N%26);
		String ans = "";
		do{
			N /= 26;
			char c;
			if(tmp == 0){
				c = (char) (25 + 'a');
			}else{
				c = (char) (tmp-1 + 'a');
			}
			ans += c;
			tmp = (int)(N%26);
		}while(N >= 1);
		for(int i=ans.length();i>0;--i){
			System.out.print(ans.charAt(i-1));
		}
	}
}
