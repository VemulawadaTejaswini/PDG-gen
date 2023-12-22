import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner (System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int ans=0;
        if(a<b){
            ans+=b;
            b--;
        }else{
            ans+=a;
            a--;
        }
        if(a<b){
            ans+=b;
            b--;
        }else{
            ans+=a;
            a--;
        }
        System.out.println(ans);
        
    }
}