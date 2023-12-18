import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, count;
        count = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 31; j++) {
                if (a == b) { 
                    if (i == j) {
                        count++;
                    }
                } else if (a > b) { 
                    if (i < a) {
                        if (i == j) count++;
                    } 
                } else { 
                    if (i == j) count++;
                }
            }
        }
        System.out.println(count);
    }
}
