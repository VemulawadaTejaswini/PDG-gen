
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            Boolean ans = false;
            while(b > 0){
                int c = b % 10;
                if(c == 7)
                {
                    System.out.println("Yes");
                    ans = true;
                    break;
                }
                b /= 10;

            }
            if(ans == false)
            System.out.println("No");

        }
    }

