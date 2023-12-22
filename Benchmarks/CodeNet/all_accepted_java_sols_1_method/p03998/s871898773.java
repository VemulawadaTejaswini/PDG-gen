import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int flg=0;
        
        char n = a.charAt(0);
        
        for(int i=0; i<300; i++){
            
            
            
            
            if(n=='a'){
                if(a.length()==0){
                    System.out.println("A");
                    return;
                }
                n = a.charAt(0);
                a = a.substring(1,a.length());
            }else if(n=='b'){
                if(b.length()==0){
                    System.out.println("B");
                    return;
                }
                n = b.charAt(0);
                b = b.substring(1,b.length());
            }else if(n=='c'){
                if(c.length()==0){
                    System.out.println("C");
                    return;
                }
                n = c.charAt(0);
                c = c.substring(1,c.length());
            }
        }
        
   }
}
