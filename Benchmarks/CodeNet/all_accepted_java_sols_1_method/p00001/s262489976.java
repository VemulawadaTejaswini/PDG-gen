import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int[] hills = new int[10];
	for (int i = 0; i < 10; i++) {
	    hills[i] = scan.nextInt();
	}
	for (int i = 0; i < 10; i++) {
	    for (int j = i+1; j < 10; j++) {
		if (hills[i] < hills[j]) {
		    int tmp = hills[i];
		    hills[i] = hills[j];
		    hills[j] = tmp;
		}
	    }
	}
	System.out.println(hills[0]);
	System.out.println(hills[1]);
	System.out.println(hills[2]);
    }
}
    