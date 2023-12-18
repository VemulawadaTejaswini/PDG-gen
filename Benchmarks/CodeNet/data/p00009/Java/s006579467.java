import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String inData = "";
            while ((inData = scan.nextLine()) != null) {
                int num = Integer.parseInt(inData);
                int primeCount = 0;
                int yakusu = 0;
                for (int i = 2; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            yakusu++;
                        }
                    }
                    if (yakusu == 2) {
                        primeCount++;
                    }
                    yakusu = 0;
                }
                System.out.println(primeCount);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}