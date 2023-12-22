import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        
        int ans = 0;
        
        if(P <= Q && P <= R) {
            if(Q <= R) {
                ans = P+Q;
            }else {
                ans = P+R;
            }
        }else if(Q <= P && Q <= R) {
            if(P <= R) {
                ans = Q+P;
            }else {
                ans = Q+R;
            }
        }else if(R <= Q && R <= P) {
            if(Q <= P) {
                ans = R+Q;
            }else {
                ans = R+P;
            }
        }
        
        System.out.println(ans);
    }
}