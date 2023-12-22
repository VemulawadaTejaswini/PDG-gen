import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int k=sc.nextInt(),m=7;
        int res = -1;
        for(int i=1;i<=k+2;i++){
            int t=m%k;
            if(t==0){
                res=i;
                break;
            }
            else{
                m=t*10+7;
            };
        }
        System.out.println(res);
    }
}