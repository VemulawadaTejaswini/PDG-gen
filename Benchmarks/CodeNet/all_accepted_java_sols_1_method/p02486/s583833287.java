import java.util.*;
class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(true){
                        int n = sc.nextInt(), x = sc.nextInt();
                        int cnt=0;
                        if(n==0&&x==0)break;
                        for(int i=1;i<=n;i++){
                                for(int j=i;j<=n;j++){
                                        for(int k=j;k<=n;k++){
                                                if(i+j+k==x&&i!=j&&i!=k&&j!=k){
                                                        cnt++;
                                                }
                                        }
                                }
                        }
                        System.out.println(cnt);
                }
        }
}