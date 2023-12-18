import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=1000000;
        boolean[] N=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!N[i]){
                for(int j=i+i;j<=n;j+=i){
                    N[j]=true;
                }
            }
        }
        while(sc.hasNextInt()){
            n=sc.nextInt();
            int ans=0;
            for(int i=2;i<=n;i++){
                if(!N[i]){
                    ans++;
                }
            }
            System.out.println(ans);
}
}
}