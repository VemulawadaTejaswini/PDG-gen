import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int n = ((s.nextInt()-1)%39+1);
			if(n > 0 && n < 10) {
				System.out.println("3C0"+n);
			}
			else {
				System.out.println("3C"+n);
			}
		}
	}
}