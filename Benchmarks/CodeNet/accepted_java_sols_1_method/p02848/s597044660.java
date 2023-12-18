import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String s = stdIn.next();
        char c[] = s.toCharArray();
        char z = 'Z';
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] + (n % 26) > z){
                c[i] += n % 26 - 26;
            }else{
                c[i] += n % 26;
            }
            
        }
        
        
        for(int i = 0; i < s.length(); i++){
            if(i != s.length() - 1){
                System.out.print(c[i]);
            }else{
                System.out.println(c[i]);
            }
        }
    }
}
