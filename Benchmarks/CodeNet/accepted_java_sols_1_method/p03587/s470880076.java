import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '1') {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
