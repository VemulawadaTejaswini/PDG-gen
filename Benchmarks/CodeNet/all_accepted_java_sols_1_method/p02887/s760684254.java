import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,count = 1;
        String s;
        
        n = sc.nextInt();
        s = sc.next();
        
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) != s.charAt(i + 1)) count++;
        }
        System.out.println(count);
    }
}