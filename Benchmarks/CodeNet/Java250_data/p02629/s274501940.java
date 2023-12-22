

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		ArrayList<Character> al=new ArrayList<Character>();
		while(n>0) {
			long x=(n-1)%26;
			al.add((char) ('a'+x));
			n=(n-1)/26;
		}
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i));
		}
	}

}
