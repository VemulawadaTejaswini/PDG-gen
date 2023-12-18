import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int d, sum, hight;
	while (scan.hasNext()) {
	    d = Integer.parseInt(scan.nextLine());
	    sum = 0;
	    for (int i = 0; i*d < 600; i++) {
		hight = i * d * i * d;
		sum += hight * d;
	    }
	    System.out.println(sum);
	}
    }
}