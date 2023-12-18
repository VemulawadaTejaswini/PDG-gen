import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
    
    int  S = sc.nextInt();
    
    int s = S%60;
    
    int M = S/60;
    
    int m = M%60;
    
    int H = M/60;
    
    int h = H%60;
    
    System.out.printf("%d:%d:%d\n",h,m,s);
    
    }
}


