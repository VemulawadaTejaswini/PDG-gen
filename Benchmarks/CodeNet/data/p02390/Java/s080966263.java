import java.util.*;

public class Main {
    public static void main(String[] args) {
	try {
	    Scanner scan = new Scanner(System.in);
	    int sec = scan.nextInt();
	    int h = sec / 3600;
	    int m = (sec / 60) % 60;
	    int s = sec % 60;
	    System.out.printf("%d???%d???%d", h, m, s);
	    scan.close();
	} catch (InputMismatchException e) {
	    System.out.println("??°?????\????????\?????????????????????");
	}
    }
}