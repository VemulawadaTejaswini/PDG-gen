import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String l = sc.next();
		char []a = l.toCharArray();
		int count= 0;
		
		for(int i = 1; i <=3; i++) {
			if(a[i] == a[i-1]) {
				count++;
			}			
		}
		if(count == 0) {
			System.out.println("Good");
		}
		if(count != 0) {
			System.out.println("Bad");
		}

	}

}
