import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int debt = 100000;
        int nWeeks = sc.nextInt();
        for (int i = 0; i < nWeeks; i++) {
            debt = (int)(Math.ceil(debt*1.05 / 1000) * 1000);
        }

        System.out.println(debt);
    }
}