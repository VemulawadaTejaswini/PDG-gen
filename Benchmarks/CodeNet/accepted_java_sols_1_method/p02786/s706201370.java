import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long h = Long.parseLong(sc.next());
		
		
		int cnt = 0;
		while(h!=0) {
			
			h = h/2;
			cnt++;
		}
		
		Long ans = (1l << cnt) -1 ;
		
		System.out.println(ans);
	}

}