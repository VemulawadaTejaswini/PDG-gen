import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = new String();
        
        String b = new String();
        String c = new String();
        int d =0;
        
        while(true){
        
        a = sc.next();
        b = sc.next();
        c = sc.next();
        
        int e = Integer.parseInt(a);
        int f = Integer.parseInt(c);
        
        if("+".equals(b)){
            d = e+f;
        }
        if("-".equals(b)){
            d = e-f;
        }
        if("*".equals(b)){
            d = e*f;
        }
        if("/".equals(b)){
            d = e/f;
        }
        if("?".equals(b))break;
        
        
        
        System.out.println(d);
        }
        
    }
}

