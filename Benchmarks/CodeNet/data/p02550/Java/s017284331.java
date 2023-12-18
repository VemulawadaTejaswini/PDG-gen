import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int m = scn.nextInt();
        int sum=x;
        int a=x;
        for(int i=1;i<n;i++)
        {
          if(a>m)
          {a = ((int)Math.pow(a,2))%m;}
          else 
          {a=(int)Math.pow(a,2)}

            sum +=a;

        }
        System.out.println(sum);
    }
}
