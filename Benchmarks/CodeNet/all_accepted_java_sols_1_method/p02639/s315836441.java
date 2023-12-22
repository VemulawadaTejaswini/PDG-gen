import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x1,x2,x3,x4,x5,ans=0;
        x1=scan.nextInt();
        x2=scan.nextInt();
        x3=scan.nextInt();
        x4=scan.nextInt();
        x5=scan.nextInt();
        if(x1==0) ans=1;
         if(x2==0) ans=2;
          if(x3==0) ans=3;
           if(x4==0) ans=4;
            if(x5==0) ans=5;
        System.out.println(ans);
    }
}
