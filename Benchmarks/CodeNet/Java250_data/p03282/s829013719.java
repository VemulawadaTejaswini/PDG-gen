import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '1'){
                System.out.println(c);
                return;
            }
            if((long)i+1 == k){
                break;
            }
        }
        System.out.println(1);
    }
}
