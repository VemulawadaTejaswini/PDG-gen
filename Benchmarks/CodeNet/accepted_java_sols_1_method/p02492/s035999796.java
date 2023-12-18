import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(;;){
			int x = sc.nextInt();
			String str = sc.next();
			int y = sc.nextInt();
			int ans;
			if(str.equals("?")){
				break;
			}
			else if(str.equals("+") ){
				ans = x + y;
			}
			else if(str.equals("-")){
				ans = x - y;
			}
			else if(str.equals("*")){
				ans = x * y; 
			}
			else {
				ans = x / y;
			}
			System.out.println(ans);
		}
	}

}