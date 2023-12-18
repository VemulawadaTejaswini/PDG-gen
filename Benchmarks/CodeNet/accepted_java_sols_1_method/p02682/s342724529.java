import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int cnt  =0;

        while(true){
            if(a>k){
                cnt+=k;
                k=0;
                break;
            }else{
                cnt+=a;
                k-=a;
            }
            if(k<=0){
                break;

            }
            if(b>k){
                k=0;
                break;
            }else{
                k-=b;
            }
            if(k<=0){
                break;
            }

            if(c>k){
                cnt-=k;
                k=0;
                break;
            }else{
                cnt-=c;
                k-=c;
            }
            if(k<=0){
                break;
            }



        }
        System.out.println(cnt);
    }
}




