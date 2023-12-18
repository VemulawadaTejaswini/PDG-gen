import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0)break;
            boolean flag;
            for (int i = 0; i < a; i++) {
                flag = (i%2 == 1);
                for (int j = 0; j < b; j++) {
                    if (flag == false) {
                        System.out.print("#");
                        flag = true;
                    } else {
                        System.out.print(".");
                        flag = false;
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
