import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int kosuu = sc.nextInt();
        List<String> syouhin = new ArrayList();
        for(int i = 0;i < kosuu;i++){
            String k = sc.next();
            syouhin.add(k);
        }
        List<String> listB = new ArrayList<String>(new HashSet<>(syouhin));
        System.out.println(listB.size());
    }
}
