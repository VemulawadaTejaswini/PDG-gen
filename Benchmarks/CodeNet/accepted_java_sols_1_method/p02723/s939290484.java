import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        scan.close();

        String[] aArray = a.split("");

        if (aArray[2].equals(aArray[3]) && aArray[4].equals(aArray[5])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}