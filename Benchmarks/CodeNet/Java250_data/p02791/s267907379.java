import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), temp = t, counter = 0;
        for (int count = 0; count < t; count++) {
            int x = scan.nextInt();
            if(x <= temp) {
                temp = x; counter++;
            }
        }
        System.out.println(counter);
        scan.close();
    }
}