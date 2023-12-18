import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int cake = Integer.parseInt(sc.next());
        int donut = Integer.parseInt(sc.next());
        
        System.out.println((total-cake)%donut);
    }
}
