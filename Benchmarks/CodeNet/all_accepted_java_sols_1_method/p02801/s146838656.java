import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        
        char[] next = line1.toCharArray();
        next[0]++;
        
        System.out.println(next[0]);
    }
}
