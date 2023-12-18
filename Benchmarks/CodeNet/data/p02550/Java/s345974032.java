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
            a = ((int)Math.pow(a,2))%m;

            sum +=a;

        }
        System.out.println(sum);
    }
}
