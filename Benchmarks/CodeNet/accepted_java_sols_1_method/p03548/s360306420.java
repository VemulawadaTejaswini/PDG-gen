import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        x -= z;
        int count = 0;
        while (x-y-z>=0) {
                count++;
                x -= y;
                x -= z;
        }
        System.out.println(count);
    }
}
