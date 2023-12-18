
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		for(int i=0;i<5;i++) {
			count=sc.nextInt();
			if(count==0) {
				System.out.println(i+1);
				System.exit(0);
			}
		}
		
		sc.close();
	}
}
