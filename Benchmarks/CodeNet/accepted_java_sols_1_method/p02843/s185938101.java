import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = x / 100;
        if(x >= 100 * p && x <= 105 * p){
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}