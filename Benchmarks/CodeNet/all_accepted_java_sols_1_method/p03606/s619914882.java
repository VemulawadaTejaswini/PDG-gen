import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int l = in.nextInt(), r = in.nextInt();
            sum += r - l + 1;
        }
        System.out.println(sum);
    }
}
