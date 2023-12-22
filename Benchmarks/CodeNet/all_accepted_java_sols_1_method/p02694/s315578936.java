import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long x = Long.parseLong(scan.next());
		long ans = 0;
		long yen = 100;
		while (yen < x){
			++ans;
			yen*=1.01;
		}

		System.out.print(ans);

	}
}

//end
