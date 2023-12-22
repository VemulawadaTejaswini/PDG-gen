import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input > 1000) {
            input -= 1000;
        }
      
        if (input == 0)
            System.out.println(0);
        else {
            int res = 1000-input;
            System.out.println(res);
        }
    }
}
