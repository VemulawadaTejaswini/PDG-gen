import java.util.*;
import static java.lang.System.out;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ0055();
	}
	
	void AOJ0055(){	// Sequence
		while(sc.hasNext()){
			double last=sc.nextDouble(), ans=last;
			for(int i=2; i<=10; i++){
				ans+= i%2==0? last*2: last/3;
				last = i%2==0? last*2: last/3;
				// out.println(last);
			}
			out.println(ans);
		}
	}
}