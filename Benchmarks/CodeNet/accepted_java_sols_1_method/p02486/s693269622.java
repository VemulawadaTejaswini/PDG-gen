import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            int sum=s.nextInt();
            if(n==0&&sum==0)break;
            int count=0;
            for(int i=1;i<=n;i++)
                for(int j=i+1;j<=n;j++)
                    for(int k=j+1;k<=n;k++)
                        if(i+j+k==sum)count++;
             
            System.out.println(count);
        }
    }
}