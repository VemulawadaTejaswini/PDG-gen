
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		ArrayList<String>  str = new ArrayList<String>();
		for(int i = 0 ; i < num ; i++) {
			str.add(scan.next());
		}
		
		for(int j = 1 ; j < str.size() ; j++) {
			if(str.get(j - 1).charAt(str.get(j - 1).length() - 1) != str.get(j).charAt(0)) {
				System.out.print("No");
				return;
			}
			
			String target = str.get(j);
			for(int k = 0 ; k < str.size() ; k++) {
				if(j != k) {
					if(target.equals(str.get(k))) {
						System.out.print("No");
						return;
					}
				}
			}
		}
		
		scan.close();
		
		System.out.print("Yes");
	}
}
