import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        while(tmp>0) {
            if(tmp%10==7) {
                System.out.println("Yes");
                return;
            }
            tmp/=10;
        }
        System.out.println("No");
//        System.out.println(String.format("%d", tmp));
    }
}
