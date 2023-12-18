import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int t=sc.nextInt();
            if(t==0){
                break;
            }
            int n=sc.nextInt();
            int cnt=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                cnt+=b-a;
            }
            if(t<=cnt){
                System.out.println("OK");
            }else{
                System.out.println(t-cnt);
            }
        }
    }
}
