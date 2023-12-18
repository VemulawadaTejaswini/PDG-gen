import java.util.Scanner;
public class Main {
	static int cur;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int l=0; l<k; l++){
			S = sc.next();
			cur = 0;
			int a = parse();
			assert (cur == S.length());
			System.out.println(a);
		}
	}
	static int parse() {
		return expression();
	}
	static int digit(){
		assert(Character.isDigit(S.charAt(cur)));
		int n = S.charAt(cur) -'0';
		cur++;
		return n;
	}
	static int number() {
		int n = digit();
		while ((cur < S.length()) && Character.isDigit(S.charAt(cur)))
			n = n*10 + digit();
		return n;
	}
	static int expression(){
		int sum = term();
		while (S.charAt(cur) != '='){
			if (S.charAt(cur) == '+'){
				cur++;
				sum+=term();
			}
			else if (S.charAt(cur)=='-'){
				cur++;
				sum-=term();
			}
			else break;
		}
		return sum;
	}
	static int factor(){
		if (S.charAt(cur)!='(') return number();
		cur++;
		int n = expression();
		assert(S.charAt(cur)==')');
		cur++;
		return n;
	}
	static int term(){
		int a = factor();
		while (true) {
			if (S.charAt(cur) == '*'){
				cur++;
				a*=factor();
			}
			else if (S.charAt(cur) == '/'){
				cur++;
				a/=factor();
			}
			else break;
		}
		return a;
	}
}