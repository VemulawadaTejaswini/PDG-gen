import java.util.*;
import static java.lang.System.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String R = sc.next();
		int mae = Integer.parseInt(R.substring(0,3));
		int ato = Integer.parseInt(R.substring(1,4));
		if(mae%111==0 || ato%111==0){
			out.print("Yes");
		}else{
			out.print("No");
		}

		
	}
}