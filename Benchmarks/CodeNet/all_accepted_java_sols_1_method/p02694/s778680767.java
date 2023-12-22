import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        long target = Long.valueOf(sc.next());
        long yen = 100;
        int count = 0;

        for(;;) {
            yen *= 1.01;
            count++;
            if(yen >= target) break;
        }
        System.out.println(count);
	}
}