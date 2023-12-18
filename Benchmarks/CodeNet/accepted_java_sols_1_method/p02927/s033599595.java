
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int count=0;
        for(int m=1;m<=M;m++){
            for(int d=1;d<=D;d++){
                int d1 = d%10;
                int d10 = (d-d1)/10;
                if(d1<2 || d10<2)continue;
                if(d1*d10==m)count++;
            }
        }
        System.out.println(count);
    }
}