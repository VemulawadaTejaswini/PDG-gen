import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            if(s.equals("-")) break;
            int tt=sc.nextInt();
            String tmp=s;
            while(tt>0){
                int n=sc.nextInt();
                
                tmp=tmp.substring(n)+tmp.substring(0,n);
                tt--;
            }
            System.out.println(tmp);
        }
        
    }
}
