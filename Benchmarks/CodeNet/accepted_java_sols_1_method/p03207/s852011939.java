import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            sum += n;
            max = Math.max(max, n);
        }
        sum -= max/2;
        System.out.println(Integer.valueOf(sum));
    }
}
