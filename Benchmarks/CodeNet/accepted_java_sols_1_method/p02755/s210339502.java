import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int p8 = Integer.parseInt(sc.next());
        int p10 = Integer.parseInt(sc.next());
        
        int i=0;
        int a=0, b=0;
        for(i=0; i<1100; i++){
            a=i*2/25;
            b=i/10;
            if((a==p8)&&(b==p10)) break;
        }
        if(i>1001) System.out.println(-1);
        else System.out.println(i);
        //String s = sc.next();
        
    }
    
}