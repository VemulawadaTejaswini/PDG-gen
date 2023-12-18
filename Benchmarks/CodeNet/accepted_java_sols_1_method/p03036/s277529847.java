import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long r = Long.parseLong(sc.next());
	long d = Long.parseLong(sc.next());
	long x = Long.parseLong(sc.next());
	for(int i = 0; i<10; i++) {
	    x = r*x -d;
	    System.out.println(x);
	}

    }
}