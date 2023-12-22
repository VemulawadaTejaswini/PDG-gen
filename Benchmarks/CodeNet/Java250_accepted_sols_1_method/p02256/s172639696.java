import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        
        if (y > x) {
        	int tmp = x;
        	x = y;
        	y = tmp;
        }
        
        while (x >= y) {
        	if (x % y == 0) {
        		break;
        	}
        	int temp = y;
        	y = x % temp;
        	x = temp;
        }
        
        System.out.println(y);
	}

}
