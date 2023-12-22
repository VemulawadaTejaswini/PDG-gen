
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tyuukan = scan.nextInt();
        int kimatu = scan.nextInt();
        int saisiken = scan.nextInt();
        while (tyuukan != -1 || kimatu != -1 || saisiken != -1) {
            int y;
            y = tyuukan + kimatu;
            if (tyuukan == -1 || kimatu == -1) {
                System.out.println("F");
            } else if (y >= 80) {
                System.out.println("A");
            } else if (y >= 65 && y < 80) {
                System.out.println("B");
            } else if (y >= 50 && y < 65) {
                System.out.println("C");
            } else if (y >= 30 && y < 50) {
                if (saisiken >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
            tyuukan = scan.nextInt();
            kimatu = scan.nextInt();
            saisiken = scan.nextInt();
        }
    }
}

