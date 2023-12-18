import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        if(v <= w) {
            System.out.println("NO");
            return;
        }

        int ret = 0;
        int ab = b -a;
        int vw = v -w;
        ret = ab / vw;
        if(ab % vw !=0){
            ret++;
        }

        if(t >= ret) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
