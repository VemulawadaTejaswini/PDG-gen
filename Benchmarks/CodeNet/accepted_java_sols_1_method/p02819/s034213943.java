import java.lang.Math;
import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 2 | X == 3 | X == 5) {
        		System.out.println(X);
        } else {
        		int i = 2;
        		while (true) {
        			if (X%i == 0) {
        				i = 2;
        				X++;
        			} else {
        				i++;
        			}
        			if (i == Math.ceil(Math.sqrt(X))) {
        				break;
        			}
        		}
        		System.out.println(X);
        }
    }
} 