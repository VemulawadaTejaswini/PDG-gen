import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        for (int i=0;i<10;i++){
            System.out.println(r*x-d);
            x=r*x-d;
        }
    }
}
