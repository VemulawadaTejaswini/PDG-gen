import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String w = scn.next().toLowerCase();
		String reading = scn.next();
		int cnt = 0;
		while(!reading.equals("END_OF_TEXT")){
			//System.out.println(w + "と" + reading);
			if(reading.toLowerCase().equals(w)) cnt++;
			reading = scn.next();
		}
		System.out.println(cnt);
	}
}