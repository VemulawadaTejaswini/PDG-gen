import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = n; i < 600; i += n) {
                sum += n * i * i;
            }
            System.out.println(sum);
        }
    }
}
