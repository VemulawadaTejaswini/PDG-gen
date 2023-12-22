import java.util.Scanner;

/**
 * Q1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 1;
        int i = 0;
        while(true){
            if (b <= count) {
                System.out.println(i);
                break;
            }

            count += a - 1;
            i++;
        }
    }
}