import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] planes = {a, b, c};
        Arrays.sort(planes);
        
        System.out.println(planes[0] + planes[1]);
    }
}
