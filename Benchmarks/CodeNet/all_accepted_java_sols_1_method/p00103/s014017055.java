import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, p, o;
	int[] r = {0, 0, 0};
	String[] event = {"HIT", "HOMERUN", "OUT"};
	String a;

	while (sc.hasNextInt()) {
	    n = sc.nextInt();
	    while (n-- > 0) {
		p = 0;
		o = 0;

		while (true) {
		    a = sc.nextLine();
		    if (a.equals(event[0])) {
			if (r[2] == 1) {
			    r[2] = 0;
			    p++;
			}
			if (r[1] == 1) {
			    r[1] = 0;
			    r[2]++;
			}
			if (r[0] == 1) {
			    r[0] = 0;
			    r[1]++;
			}
			r[0]++;
		    }
		    else if (a.equals(event[1])) {
			if (r[2] == 1) p++;
			if (r[1] == 1) p++;
			if (r[0] == 1) p++;
			p++;
			r[2] = 0;
			r[1] = 0;
			r[0] = 0;
		    }
		    else if (a.equals(event[2])){
			o++;
			if (o == 3) {
			    r[0] = 0;
			    r[1] = 0;
			    r[2] = 0;
			    break;
			}
		    }
		}
		System.out.println(p);
	    }
	}
    }
}