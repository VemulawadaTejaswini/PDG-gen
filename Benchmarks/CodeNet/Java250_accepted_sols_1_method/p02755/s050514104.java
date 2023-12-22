import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = -1;
        for(int i = 1; i <= 1000; i++) {
            int a = (int)Math.floor(i*0.08);
            int b = (int)Math.floor(i*0.1);
            if(a==A && b==B) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
