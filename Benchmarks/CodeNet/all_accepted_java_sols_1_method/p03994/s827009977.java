import java.util.*;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        StringBuffer s = new StringBuffer(sc.nextLine());
        int k = sc.nextInt();
            
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i) != 'a' && k - ( 26 - ( (int)s.charAt(i) - 97 ) ) >= 0){
                    k -= ( 26 - ( (int)s.charAt(i) - 97 ) );
                    s.setCharAt(i, 'a');
                }
            }
//        System.out.println(26-(int)'i' + 97);
        
        k = k % 26;
        if(s.charAt(s.length()-1) + k > 122){
            s.setCharAt(s.length()-1, (char)(s.charAt(s.length()-1) + k-26));
        }else{
            s.setCharAt(s.length()-1, (char)(s.charAt(s.length()-1) + k));
        }
        System.out.println(s);
        
//        System.out.println(100-('c'-96+21));
//        System.out.println(26-( (int)'o' - 97));
        
        
    }
}