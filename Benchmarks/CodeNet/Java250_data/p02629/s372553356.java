import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        StringBuilder out = new StringBuilder();
        while(n > 26){
            if(n % 26 != 0){
                out.append(name(n % 26));
                n /= 26;
            }else{
                out.append(name(26));
                n = n / 26 - 1;
            }
        }
        out.append(name(n));
        for(int i = out.length() - 1; i >= 0 ; i--) System.out.print(out.charAt(i));
        scan.close();
    }
    
    public static String name(long n){
        
            byte[] b = {(byte) (n + 96)};
            if(n % 26 == 0) b[0] = 122;
            return new String(b);
       
            
    }
}