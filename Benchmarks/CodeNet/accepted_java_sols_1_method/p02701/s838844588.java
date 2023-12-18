import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        HashSet<String> hs = new HashSet<String>();
        for (int i = 0; i < value; i++) {
            hs.add(sc.next());
        }
        System.out.println(hs.size());
        
    }
}
