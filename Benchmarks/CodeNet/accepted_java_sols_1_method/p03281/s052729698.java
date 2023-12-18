import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int cnt2=0;

        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if(i%j==0 && j%2==1){
                    cnt++;
                }
            }
            if(cnt==8){
                cnt2++;
                //System.out.println(i);
            }
            cnt=0;
        }

            System.out.println(cnt2);
    }
}
