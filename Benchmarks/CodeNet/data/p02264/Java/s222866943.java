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
        int total=0,cnt=n;
        while(cnt!=0){
            if(time[0]>0){
                time[0]-=q;
                if(time[0]<=0){
                    cnt--;
                    total+=time[0]+q;
                    System.out.println(name[0]+" "+total);
                }else{
                    total+=q;
                }
            }
            name[n]=name[0];
            time[n]=time[0];
            for(int i=0;i<n;i++){
                name[i]=name[i+1];
                time[i]=time[i+1];
            }
        }
    }
}
