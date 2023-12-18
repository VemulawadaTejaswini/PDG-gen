import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<String> s = new HashSet<String>();
        for (int i = 0; i < n; i++){
            s.add(input.next());
        }
        System.out.println(s.size());
    }
}