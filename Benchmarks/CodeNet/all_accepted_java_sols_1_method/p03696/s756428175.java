import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int counta = 0;
        for (int i = n - 1; i >= 0; i--) {
            char c = str.charAt(i);
            
            if (c == ')') {
                counta++;
            } else {
                if (counta > 0) {
                    counta--;
                }
            }
        }
        
        String stra = "";
        while (counta-- > 0) {
            stra += "(";
        }
        
        counta = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            
            if (c == '(') {
                counta++;
            } else {
                if (counta > 0) {
                    counta--;
                }
            }
        }
        
        String strb = "";
        while (counta-- > 0) {
            strb += ")";
        }       
        
        System.out.println(stra + str + strb);
    }
}
