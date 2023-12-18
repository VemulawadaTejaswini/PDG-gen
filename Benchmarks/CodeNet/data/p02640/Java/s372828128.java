import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int X = scan.nextInt();
                int Y = scan.nextInt();

                scan.close();

                boolean isExist = false;


                if (Y%2 == 0 && -X + Y/2 >= 0 && 2*X - Y/2 >= 0) {
                	isExist = true;
                }

                if (isExist) {
                	System.out.println("Yes");
                } else {
                	System.out.println("No");
                }

        }

}