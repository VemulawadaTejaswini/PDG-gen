import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int max = 0;
        int len = sc.nextInt();
        int prev = sc.nextInt();
        int num;

        for (int i = 1; i < len; i++) {
            num = sc.nextInt();
            if (prev >= num) {
                count++;
                if (max < count) {
                    max = count;
                } 
            } else {
                count = 0;
            }
            prev = num;
        }

        System.out.println(max);
    }
}