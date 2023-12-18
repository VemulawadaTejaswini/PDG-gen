import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int k = Integer.parseInt(sc.next());
        
        TreeSet<String> set = new TreeSet<>();
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j <= s.length()-i; j++){
                set.add(s.substring(j, j+i));
            }
        }
        
        String ans = "";
        for(int i = 0; i < k; i++){
            ans = set.pollFirst();
        }
        System.out.println(ans);
    }
}