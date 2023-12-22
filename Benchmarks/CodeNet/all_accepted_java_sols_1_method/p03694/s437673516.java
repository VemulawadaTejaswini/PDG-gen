import java.util.*;
class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	int N =	Integer.parseInt(sc.next());
	int a =	0;
	int max	= 0;
	int min	= 1001;
        for(int i = 0; i<N; i++) {
            a = Integer.parseInt(sc.next());
            max	= Math.max(max,a);
            min	= Math.min(min,a);
        }
	System.out.println(max-min);
    }
}