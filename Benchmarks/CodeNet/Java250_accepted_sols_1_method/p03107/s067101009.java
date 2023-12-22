import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = 0, b = 0;
		int num = 0;
		for(int i = 0;i < s.length(); i++) {
			if((s.charAt(i)) == ('1')){
				a++;
			}else {
				b++;
			}
		}
		if(a == b) {
			num = s.length();
		}else if(a<b) {
			num = b-a;
			num = s.length() - num;
		}else {
			num = a-b;
			num = s.length() - num;
		}
		System.out.println(num);
	}

}
