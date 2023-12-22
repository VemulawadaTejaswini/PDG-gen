import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b) {
            while (b-- > 0) {
            System.out.print(a);
            }
            System.out.println();
            return;
        }
        
        if (a < b) {
            while (b-- > 0) {
            System.out.print(a);
            }
            System.out.println();
            return;
        } else {
            while (a-- > 0) {
            System.out.print(b);
            }
            System.out.println();
            return;
            
        }
        
        // String stra = "";
        // for (int i = 0; i < Integer.parseInt(b); i++) {
        //     stra += "" + a;
        // }
        // String strb = "";
        // for (int i = 0; i < Integer.parseInt(a); i++) {
        //     strb += "" + b;
        // }
        // if (stra < strb) {
        //     System.out.println(stra);
        // } else {
        //     System.out.println(strb);
        // }
    }
}
