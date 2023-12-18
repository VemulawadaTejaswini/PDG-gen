import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=0; i<=x; i++) {
            int num = 2*i + 4*(x-i);
            if(y == num) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }


}