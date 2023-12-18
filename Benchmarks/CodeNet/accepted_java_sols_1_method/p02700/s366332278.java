import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

		while(a>0&&c>0) {
			a-=d;
			c-=b;
		}

		if (c<=0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	    scan.close();	
    }
}