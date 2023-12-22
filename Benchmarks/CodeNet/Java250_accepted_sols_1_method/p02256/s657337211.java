import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Integer x = Integer.parseInt(s.next());
		Integer y = Integer.parseInt(s.next());
		s.close();
		if(x > y){
			Integer remain = x % y;
			Integer new_remain = y % remain;
			Integer bkp = 0;
			while(new_remain > 0){
				bkp = new_remain;
				new_remain = remain % new_remain;
			}
			System.out.println(bkp);
		}
		else if(y > x){
			Integer remain = y % x;
			Integer new_remain = x % remain;
			Integer bkp = 0;
			while(new_remain > 0){
				bkp = new_remain;
				new_remain = remain % new_remain;
			}
			System.out.println(bkp);
		}
		else{
			System.out.println(y);
		}
	}
}