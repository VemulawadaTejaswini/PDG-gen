import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int time = 1;
	int x;
	ArrayList<String> a = new ArrayList<String>();
	while (true) {
	    x = sc.nextInt();
	    if (x == 0) {
		break;
	    }
	    a.add("Case " + time + ": " + x);
	    time += 1;
	}
	for (int i = 0; i < a.size(); i++) {
	    if (a.get(i) != null) {
		System.out.println(a.get(i));
	    }
	}
    }
}