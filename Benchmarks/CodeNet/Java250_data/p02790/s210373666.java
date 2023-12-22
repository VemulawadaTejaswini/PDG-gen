import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        if(inta <= intb) {
            for(int i = 0; i < intb; i++) {
                System.out.print(a);
            }
            System.out.println("");
        }else {
            for(int i = 0; i < inta; i++) {
                System.out.print(b);
            }
            System.out.println("");
        }
        
        }
}