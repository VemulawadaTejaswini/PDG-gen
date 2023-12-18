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
		Integer remain = x % y;
		if(remain == 0){
			System.out.println(y);
		}
		else{
			System.out.println(remain);
			while(y % remain != 0){
				remain = y % remain;
			}
			System.out.println(remain);
		}
	}
}