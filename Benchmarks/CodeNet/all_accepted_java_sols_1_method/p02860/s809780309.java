import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//In
		int n = scan.nextInt();
		String str = scan.next();
		char letter[] = new char[n];
		for(int i=0;i<n;i++) {
			letter[i] = str.charAt(i);
		}
		
		//Process and Out
		if(!(n%2 == 0)) {
			System.out.println("No");
		}else {
			for(int i=0;i<n/2;i++) {
				if(!(letter[i] == letter[n/2+i])) {
					System.out.println("No");
					break;
				}else if(i == n/2-1) {
					System.out.println("Yes");
				}
			}
		}
		
		
	}

}
