import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        String s=new StringBuffer(sc.next()).reverse().toString();
        long ans=0;
        if(p==2||p==5){
            for(int i=0;i<n;i++){
                if(Integer.parseInt(s.substring(i,i+1))%p==0){
                    ans+=n-i;
                }
            }
            System.out.println(ans);
            return;
        }
        int mod=1;
        int[] sum=new int[n+1];
        for(int i=0;i<n;i++){
            sum[i+1]=(sum[i]+Integer.parseInt(s.substring(i,i+1))*mod)%p;
            mod*=10;
            mod%=p;
        }
        Arrays.sort(sum);
        long count=1;
        for(int i=1;i<n+1;i++){
            if(sum[i-1]==sum[i])count++;
            else{
                ans+=count*(count-1)/2;
                count=1;
            }
        }
        ans+=count*(count-1)/2;
        System.out.println(ans);
        
        
 
    }



}
