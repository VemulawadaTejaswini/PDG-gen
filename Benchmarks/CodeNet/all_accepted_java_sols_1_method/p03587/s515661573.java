import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int res = 0;
        
        for(int i = 0; i < 6; i++){
            res = s.charAt(i) == '1' ? res + 1 : res;
        }
        
        System.out.println(res);
    }
}
