import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            int m=s.nextInt();
            if(n==0&&m==0)break;
            if(n>m)System.out.println(m+" "+n);
            else System.out.println(n+" "+m);
        }
    }
}
//by TTTMongolia 10/05/2012