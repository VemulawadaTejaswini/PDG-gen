import java.util.*;

public class Main {
	public static void main(String[] args) {

		int a,b,ans;
		ans = 0;
		String ope;

		Scanner sc = new Scanner(System.in);

		while(true){

			a = sc.nextInt();
			ope =  sc.next();
			b = sc.nextInt();
			
			if (ope.equals("+")){
				ans = a + b;
			}else if(ope.equals("-")){
				ans = a - b;
			}else if(ope.equals("*")){
				ans = a * b;
			}else if(ope.equals("/")){
				ans = a / b;
			}else if (ope.equals("?")){
				break;
			}
			System.out.println(ans);
		}
	}
}