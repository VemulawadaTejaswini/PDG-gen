import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.next().split("");
        
        Set<String> set = new HashSet<>();
        for (String s : line) {
            set.add(s);
        }
        
        String result = "No"; 
        if (set.size() == 2) result = "Yes"; 
        
        System.out.println(result);
    }
}