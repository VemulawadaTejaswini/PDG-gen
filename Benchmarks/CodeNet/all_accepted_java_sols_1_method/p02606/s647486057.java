import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int L = sc.nextInt();
	int R = sc.nextInt();
	int d = sc.nextInt();
	if (L%d == 0 && R%d == 0) {
	    System.out.print(R/d - L/d + 1);
	} else {
	    System.out.print(R/d - L/d);
	}
    }
}

