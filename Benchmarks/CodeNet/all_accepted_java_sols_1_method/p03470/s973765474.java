import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        Set<Integer> mochiSet = new HashSet<>();
        for(int i = 0;i < n; i++) {
            mochiSet.add(sc.nextInt());
        }

        System.out.println(mochiSet.size());
    }
}