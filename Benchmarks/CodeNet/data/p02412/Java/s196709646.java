 
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true){

        int n=sc.nextInt();
        int x=sc.nextInt();
        if (n==0&&x==0){break;}

        int s=0;
            for(int y=1;y<=n;y++) {
            for (int w = 1+y; w <= n; w++) {
                for (int v = 1+w; v <= n; v++) {
                    if(y+w+v==x){s++;}
                       }
                   }
               }

               System.out.println(s); }
        }
    }
    
    
    
