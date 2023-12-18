import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String strf = s.substring(0,2);
        String strb = s.substring(2); 
        
        int sf = Integer.parseInt(strf);
        int sb = Integer.parseInt(strb);
        
        String ans = "NA";
        
        if(1 <= sf && sf <= 12 && 1 <= sb && sb <= 12){
            ans = "AMBIGUOUS";
        }else if(1 <= sf && sf <= 12){
            ans = "MMYY";
        }else if(1 <= sb && sb <= 12){
            ans = "YYMM";    
        }
        System.out.println(ans);  
       
    }
}
