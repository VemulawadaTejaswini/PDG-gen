import java.util.*;

public class Main{
    
    public static final int MAX = 3501;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        
        for(long x=2; x<MAX; x+=2){
            for(long y=x; y<MAX; y+=2){
                long u = n*x*y;
                long d = 4L*x*y-n*x-n*y;
                if(d!=0 && u%d==0 && u/d>0){
                    long z = u/d;
                    System.out.println(x+" "+y+" "+z);
                    return;
                }
            }
        }
    }
}
