import java.util.Scanner;


public class AOJ10022 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String w = scn.next();
		String reading = scn.next();
		int cnt = 0;
		while(reading.equals("END_OF_TEXT")){
			if(reading.equals(w)) cnt++;
			reading = scn.next();
		}
		System.out.println(cnt);
	}
}