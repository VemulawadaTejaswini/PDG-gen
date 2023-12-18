import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long h = sc.nextInt();
        long w = sc.nextInt();

        if(h == 1 || w == 1) {
            System.out.println(1);
            return;
        }

        long res = h * w / 2 + (h*w) % 2;
        System.out.println(res);
    }
}