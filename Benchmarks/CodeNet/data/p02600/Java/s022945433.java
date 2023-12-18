import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if (x < 600) {
	    System.out.print(8);
	} else if (x < 800) {
	    System.out.print(7);
	} else if (x < 1000) {
	    System.out.print(6);
	} else if (x < 1200) {
	    System.out.print(5);
	} else if (x < 1400) {
	    System.out.print(4);
	} else if (x < 1600) {
	    System.out.print(3);
	} else if (x < 1800) {
	    System.out.print(2);
	} else {
	    System.out.print(1);
	}
    }
}
