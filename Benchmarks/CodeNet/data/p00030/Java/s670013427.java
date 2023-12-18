import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int s=sc.nextInt();
            if(n==0 && s==0) break;
            int ans=0;
            for(int i=0;i<(1<<10);i++){
                int on=0;
                int sum=0;
                for(int j=0;j<10;j++) if((i&(1<<j))!=0){
                    on++;
                    sum+=j;
                }
                if(on!=n) continue;
                if(sum==s) ans++;
            }
            System.out.println(ans);
        }
    }
}
