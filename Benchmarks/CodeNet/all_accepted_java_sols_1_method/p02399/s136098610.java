import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println((a/b) + " " + (a % b) + " " + String.format("%.5f", ((double)a/(double)b)));
    }
}
