
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int cnt_8;
        int cnt=0;

        for(int j=1;j<=n;j+=2){
            cnt_8=0;
            for(int k=1;k<=j;k++){
                if(j%k==0){
                    cnt_8++;
                }
            }
            if(cnt_8==8){
                //System.out.println("num="+j);
                cnt++;
            }
        }
    System.out.println(""+cnt);
    }
}