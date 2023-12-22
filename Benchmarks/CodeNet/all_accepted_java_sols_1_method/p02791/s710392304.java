import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());

		int cnt = 1;
		
		for(int i = 1; i < n ; i++) {
			int temp = Integer.parseInt(sc.next());
			if(a >= temp) {
				
				a = temp;
				cnt++;
			}
		}
		
		
		
		System.out.println(cnt);
		
	}
	
	
	

}