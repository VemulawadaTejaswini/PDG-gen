import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int tmp1 = x;
        x=y;
        y=tmp1;

        int tmp2 = x;
        x=z;
        z=tmp2;
        System.out.println(x + " "+ y + " " + z);

    }
}
