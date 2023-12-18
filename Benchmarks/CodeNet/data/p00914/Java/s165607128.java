import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n =sc.nextInt();
            int k =sc.nextInt();
            int s =sc.nextInt();
            
            if(n+k+s==0)break;
            int ans=0;
            for (int i = 0; i < 1<<n; i++) {
                if(Integer.bitCount(i)!=k)continue;
                int j = i;
                int cnt=1;
                int sum=0;
                while(j>0){
                    if(j%2==1){
                        sum+=cnt;
                    }
                    cnt++;
                    j>>=1;
                }
                if(s==sum)ans++;
            }
            System.out.println(ans);
        }
    }

}