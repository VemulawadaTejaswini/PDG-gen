import java.util.*;

public class Main {
     public static void main(String... args) {
     	Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<String> items = new HashSet<>();
       for (int i = 0; i < n; i++) {
         items.add(input.next());
       }
       
       System.out.println(items.size());
    }
}