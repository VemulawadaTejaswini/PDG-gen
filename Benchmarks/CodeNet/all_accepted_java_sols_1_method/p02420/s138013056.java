import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s ;
        int n ,m;
        while(true){
            s=sc.next();
            if(s.equals("-"))break;
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                m=sc.nextInt();
                s=s.substring(m)+s.substring(0,m);
            }
            System.out.println(s);
        }
    }
}
