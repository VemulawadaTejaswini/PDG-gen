import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int amount = 0;
        int sum = 0;
        while (sc.hasNext()) {
            String[] list = sc.next().split(",");
            int a = Integer.parseInt(list[0]);
            int n = Integer.parseInt(list[1]);
            count++;
            amount += a * n;
            sum += n;
        }
        System.out.println(amount + "\n" + sum*10 / count/10);
    }
}
