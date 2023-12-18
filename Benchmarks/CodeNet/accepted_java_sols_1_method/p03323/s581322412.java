import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b;
        try(Scanner cin = new Scanner(System.in)) {
            a = cin.nextInt();
            b = cin.nextInt();
        }
        if (a <= 8 && b <= 8)
            System.out.println("Yay!");
        else
            System.out.println(":(");
    }

}