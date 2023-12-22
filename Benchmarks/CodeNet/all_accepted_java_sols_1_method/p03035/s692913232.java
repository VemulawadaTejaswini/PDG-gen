import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String[] data = str.split(" ");
        int charge = 0;
        int age = 0;
        int price = 0;
            age = Integer.parseInt(data[0]);
            price = Integer.parseInt(data[1]);
        if ( 6 <= age && age <= 12) {
            charge = price / 2;
        } else if (age > 12 ) {
            charge = price;
        }
        System.out.println(charge);
        }
}