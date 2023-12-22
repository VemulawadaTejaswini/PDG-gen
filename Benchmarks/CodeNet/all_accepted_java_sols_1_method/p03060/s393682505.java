import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vi[]=new int[n];
        int ci[]=new int[n];
        for(int i=0;i<n;i++)
        {
            vi[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ci[i]=sc.nextInt();
        }
        int x=0;
        int y=0;
        for(int i=0;i<n;i++)
        {
            if(vi[i]>ci[i])
            {
                x=x+vi[i];
                y+=ci[i];
            }
        }
        System.out.println(x-y);
    }
}
