import java.util.*;

public class Main{
    public static void main(String[] args){
        int ans=0;

        while(true){
            Scanner sc = new Scanner(System.in);
            String x = sc.next();

            if(x.equals("0")){break;}
            else{
                for(int i=0;i<x.length();i++){
                    ans += x.charAt(i)-'0';
                }
                System.out.println(ans);
                ans = 0;
            }
        }
    }
}
