import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        String name[]=new String[n+1];
        int time[]=new int[n+1];
        for(int i=0;i<n;i++){
            name[i]=s.next();
            time[i]=s.nextInt();
        }
        int total=0,cnt=n,now=0,next=0;
        while(cnt!=0){
            if(time[now]>0){
                time[now]-=q;
                if(time[now]<=0){
                    cnt--;
                    total+=time[now]+q;
                    System.out.println(name[now]+" "+total);
                }else{
                    total+=q;
                    next=now+cnt;
                    if(next>n) next-=(n+1);
                    name[next]=name[now];
                    time[next]=time[now];
                }
                time[now]=0;
            }
            now++;
            if(now>n) now-=(n+1);
        }
    }
}
