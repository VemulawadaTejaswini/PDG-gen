import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long ans=1;
        long two = 2;
        if(N%2==1){
            N-=1;
        }
        while(true){
            if(N/two==0){
                break;
            }else{
                ans*=2;
                ans++;
                two*=2;
            }
        }
        System.out.println(ans);
    }
}
