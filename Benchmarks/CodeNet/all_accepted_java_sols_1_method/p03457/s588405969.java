import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n+1][3];
        arr[0][0]=0;
        arr[0][1]=0;
        arr[0][2]=0;
        for(int i = 1 ;i<=n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        for(int i = 1 ;i<=n;i++)
        {
            int time = arr[i][0]-arr[i-1][0];
            int dist=Math.abs(arr[i][1]+arr[i][2]-arr[i-1][1]-arr[i-1][2]);
            int timeleft=time-dist;
            if(timeleft<0||timeleft%2==1)
            {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}