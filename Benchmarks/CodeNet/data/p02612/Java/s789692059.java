import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int value = stdIn.nextInt();
        int change;

        if(value % 1000 == 0) {
            change = 0;
        }else {
            change = 1000 - (value % 1000);
        }

        System.out.println(change);
        stdIn.close();
    }

}