import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String answer="Yay!";
        //入力
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int k=sc.nextInt();
        //処理
        if(b-a>k)
        {
            count++;
        }else if(c-a>k)
        {
            count++;
        }else if(d-a>k)
        {
            count++;
        }else if(e-a>k)
        {
            count++;
        }else if(c-b>k)
        {
            count++;
        }else if(d-b>k)
        {
            count++;
        }else if(e-b>k)
        {
            count++;
        }else if(d-c>k)
        {
            count++;
        }else if(e-c>k)
        {
            count++;
        }else if(e-c>k)
        {
            count++;
        }
        if(count>0)
        {
            answer=":(";
        }
        System.out.println(answer);
    }
}