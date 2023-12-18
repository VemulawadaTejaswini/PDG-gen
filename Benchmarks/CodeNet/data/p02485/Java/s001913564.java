//^¦çê½ÌeÌaðvZ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len,count;
		while(! str.equals("0")){
			len = str.length();
			count=0;
			for(int i=0; i<len; i++){
				count += str.charAt(i) - '0';
			}
			System.out.println(count);
			str = sc.next();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}