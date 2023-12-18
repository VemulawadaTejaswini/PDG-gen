import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            int n = scan.nextInt();
            if(n==-1)
                break; 
            int tmp1=0,ans=0,keta=1;
            
            //下位の桁から数値を入れる
            while(n>0)
           {
              tmp1=n%4;               //その桁の値がいくつになるか
                ans=ans+(keta*tmp1);    //桁に合わせて値を入れる
                n=n/4;                  //進数分で割る
                keta=keta*10;           //桁をひとつ増やす
            }
            System.out.println(ans);
        }
    }
}