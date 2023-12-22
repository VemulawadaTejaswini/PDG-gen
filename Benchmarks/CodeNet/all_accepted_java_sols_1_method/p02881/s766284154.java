
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		long dis = Long.parseLong(data);
		int sq = (int) Math.sqrt(dis);
		outside: {
			
		    for (int i=sq; i >=1 ; i--) {
			    if (dis % i ==0) {
				    Long ans = i + dis/i -2;
				    System.out.println(ans);
				    break outside;
			    }
		    }
		}

	}

}
