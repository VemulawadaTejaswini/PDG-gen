import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function func = new Function();
        int num1, num2;

        while(true) {
            num1 = Integer.parseInt(scan.next());
            num2 = Integer.parseInt(scan.next());

            if (num1 == 0 && num2 == 0) {
                break;
            }

            func.printRct(num1, num2);
        }
    }
}

class Function {
    public void printRct(int num1, int num2) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
