import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {
    public static int ans=0;
   static void dfs(int n,int count,int prev,int s,int value){
        if(count==n){
            if(s==value)ans++;
            return ;
        }
        for(int i=prev+1;i<=9;i++){
            dfs(n,count+1,i,s,value+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            while(true){
                    int n,s;
                    n=sc.nextInt();
                    s=sc.nextInt();
                    if(n==0&&s==0)break;
                    ans=0;
                    dfs(n,0,-1,s,0);
                System.out.println(ans);
            }
        
}
}

