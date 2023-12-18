import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		int cnt = n / x;
		if(n%x != 0) {
			cnt++;
		}
		
		
		System.out.println(cnt*t);
	}

}


