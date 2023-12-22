import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String c = a+b;
        
        long x = Integer.parseInt(c);
        
        long ans=0;
        for(int i=1;;i++){
            ans=i*i;
            
            if(ans==x){
                System.out.println("Yes");
                return;
            }else if(ans>x){
                System.out.println("No");
                return;
            }
        }
    }
}
