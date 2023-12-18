import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month<=day){
            System.out.println(month);
        }else {
            System.out.println(month-1);
        }



        scanner.close();
    }
}
