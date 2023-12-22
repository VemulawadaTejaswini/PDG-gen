import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ArrayList<String> b = new ArrayList<String>();
		for(int i=0 ; i<a.length() ; i++) {
			if(a.charAt(i) == '0') {
				b.add(a.substring(i, i+1));
			}
			else if(a.charAt(i) == '1') {
				b.add(a.substring(i, i+1));
			}
			else if(!b.isEmpty()) {
				b.remove((b.size()-1));
			}
		}
		for(int i=0 ; i<b.size() ; i++) {
			System.out.print(b.get(i));
		}
		System.out.println("");
	}
}