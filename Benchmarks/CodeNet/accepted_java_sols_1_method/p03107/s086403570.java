import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character>al = new ArrayList<Character>();
		
		String s = sc.next();
		int p = s.length();
		for(int i = 0; i < p ;i++) {
			char c = s.charAt(i);
			al.add(c);
			}
		
		int temp;
		int count = 0;
		do {
			
			temp = -1;
			for(int i = al.size() -1; i >= 1 ; i--) {
				if(al.get(i) != al.get(i - 1)) {
					al.remove(i);
					al.remove(i-1);
					temp = 0;
					count++;
					break;
				}
			}
		
		}while(temp == 0);
		
		System.out.println(count * 2);
		
		
	}

}
