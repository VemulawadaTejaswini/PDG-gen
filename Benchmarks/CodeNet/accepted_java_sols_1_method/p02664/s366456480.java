import java.util.*;

public class Main {
    List<String> list = new ArrayList<String>();
    Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        sc.close();
        System.out.println(T.replace("?", "D"));
    }
}
