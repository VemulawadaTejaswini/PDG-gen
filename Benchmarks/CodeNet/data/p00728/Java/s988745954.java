import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        while (true){
            int judge = sc.nextInt();
            if (judge == 0) break;
            int sum = sc.nextInt(), max = sum, min = sum;
            for (int i = 1; i < judge; i++){
                tmp = sc.nextInt();
                sum += tmp;
                if (tmp >= max) max = tmp;
                if (tmp <= min) min = tmp;
            }
            sum -= max + min;
            System.out.println(sum / (judge - 2));
        }
    }
}