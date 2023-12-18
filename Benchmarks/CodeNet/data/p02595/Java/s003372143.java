import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        double d = Double.parseDouble(str[1]);

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] value = sc.nextLine().split(" ");
            int x = Integer.parseInt(value[0]);
            int y = Integer.parseInt(value[1]);
            if (Math.sqrt(x * x + y * y) <= d) {
                count++;
            }
        }
        System.out.println(count);
    }
}