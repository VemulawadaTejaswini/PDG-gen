import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=Integer.MAX_VALUE;
        int tmp;
        int count;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            tmp=sc.nextInt();
            count=0;
            while(tmp%2==0){
                tmp/=2;
                count++;
            }
            ans=Math.min(ans,count);
        }
        System.out.println(ans);
    }

}