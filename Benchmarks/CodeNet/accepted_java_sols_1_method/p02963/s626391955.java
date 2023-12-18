import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long s = Long.parseLong(sc.next());
        int a = 1000000000;

        System.out.println("0 0 " + a + " 1 " + (a-s%a)%a + " " + ((s-1) / a + 1));
	}
}
