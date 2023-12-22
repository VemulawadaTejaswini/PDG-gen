import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int type = Integer.parseInt(sc.next());
        int powder = Integer.parseInt(sc.next());
        int min = powder;
        for(int x=1; x<=type; x++) {
            int pow = Integer.parseInt(sc.next());
            powder -= pow;
            min = min<pow?min:pow;
        }
        System.out.println(type+powder/min);
    }
}
