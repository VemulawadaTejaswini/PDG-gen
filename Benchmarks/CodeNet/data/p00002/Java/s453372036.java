import java.util.Scanner;

class Main {
    private void digitNumber() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum = sc.nextInt() + sc.nextInt();
            int c = 0;
            while (sum != 0) {
                c++;
                sum /= 10;
            }
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        (new Main()).digitNumber();
    }
}