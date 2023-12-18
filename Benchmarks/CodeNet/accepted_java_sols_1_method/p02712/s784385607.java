import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            long  t=Long.parseLong(br.readLine());
            long p=t;
            while(p%5!=0){
                p--;
            }
            long k=p;
            p-=5;
            p=p/5;
            p+=1;
            long sum1=((p)*(5+k))/2;
            p=t;
            while(p%3!=0){
                p--;
            }
            k=p;
            p-=3;
            p=p/3;
            p+=1;
            long sum2=((p)*(k+3))/2;
            p=t;
            while(p%15!=0){
                p--;
            }
            k=p;
            p-=15;
            p=p/15;
            p+=1;
            long sum=((p)*(k+15))/2;
            long ans=((t)*(t+1))/2;
            ans-=(sum1+sum2-sum);
            System.out.println(ans);

        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
}
