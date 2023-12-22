import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        char[] c = str.toCharArray();
        char[] x1 = {c[0],c[1]};
        char[] x2 = {c[2],c[3]};
        boolean b1 = check(Integer.parseInt(new String( x1)));
        boolean b2 = check(Integer.parseInt(new String( x2)));
        
        String ans = "";
        
        if(b1 && b2){
            ans = "AMBIGUOUS";
        }else if(b1){
            ans = "MMYY";
        }else if(b2){
            ans = "YYMM";
        }else{
            ans = "NA";
        }
        System.out.println(ans);
        
        
    }
   static boolean check(int i){
        if(i > 0 && i < 13){
            return true;
        }
        return false;
    }
}