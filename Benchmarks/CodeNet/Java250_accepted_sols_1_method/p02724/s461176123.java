import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yen = scanner.nextInt();
        int divValue, modValue, totalHp;

        divValue = yen / 500;
        totalHp = divValue * 1000;
        modValue = yen % 500;

        if (modValue != 0) {
            divValue = modValue / 5;
            totalHp = totalHp + divValue * 5;
        }
        System.out.println(totalHp);


    }
}