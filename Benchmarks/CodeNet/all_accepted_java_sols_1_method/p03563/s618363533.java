import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        System.out.println(r+(g-r)*2);
    }
}