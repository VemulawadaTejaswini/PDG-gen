import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        String ans = "Yes";
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        while((a > 0) && (c > 0)){
            
            c -= b;
            if(c <= 0){
                break;
            }
            a -= d;
            if(a <= 0){
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
    }
}
