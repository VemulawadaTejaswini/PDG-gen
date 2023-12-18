import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cnt = 1;
        while(true){
            int n=s.nextInt();
            if(n==0)break;
            System.out.println("Case " + cnt + ": " + n);
            cnt++;
        }
    }
}
//by TTTMongolia 10/05/2012