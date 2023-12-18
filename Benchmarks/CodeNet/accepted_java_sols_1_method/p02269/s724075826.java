import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Set<String> dict = new HashSet<>();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                String s = sc.next();;
                if(s.equals("insert")) {
                    String str = sc.next();
                    dict.add(str);
                } else {
                    String str = sc.next();
                    if (dict.contains(str)) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
            }
        }
    }
}
