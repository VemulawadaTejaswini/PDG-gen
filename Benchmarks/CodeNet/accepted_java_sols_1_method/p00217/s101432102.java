import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int max=0;
            int m=0;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt()+sc.nextInt();
                if(max<b) {
                    max=b;
                    m=a;
                }
            }
            System.out.println(m+" "+max);
        }
    }
}
