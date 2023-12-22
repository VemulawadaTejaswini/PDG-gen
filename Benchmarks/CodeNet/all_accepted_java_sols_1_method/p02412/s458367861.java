import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0) {break;}
			int num = 0;
			for (int i=1; i<=n; i++) {
				for (int j=i+1; j<=n; j++) {
					for (int k=j+1; k<=n; k++) {
						if (i!=j && j!=k && i!=k) {
							if (i+j+k == x) {num++;}
						}
					}
				}
			}
			out.println(num);
			
			
		}
	}
}
