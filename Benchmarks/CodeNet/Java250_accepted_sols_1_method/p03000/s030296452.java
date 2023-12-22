import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int l = 0;
        int total = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            total += l;
            if(total <= x) {
                count++;
            }
        }
        System.out.println(count);
    }
}