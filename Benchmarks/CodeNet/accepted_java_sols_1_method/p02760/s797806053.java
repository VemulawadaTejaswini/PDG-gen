import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    int n=sc.nextInt();
    boolean vis[][]=new boolean[3][3];
    for(int x=0;x<n;x++)
    {
        int t=sc.nextInt();
        outer:for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(t==arr[i][j])
                {
                    vis[i][j]=true;
                    break outer;
                }
            }
        }
    }
    for(int i=0;i<3;i++)
    {
        int cntr=0;
        for(int j=0;j<3;j++)
        {
            if(vis[i][j])
            cntr++;
        }
        if(cntr==3)
        {
            System.out.println("Yes");
            return;
        }
    }
    for(int i=0;i<3;i++)
    {
        int cntr=0;
        for(int j=0;j<3;j++)
        {
            if(vis[j][i])
            cntr++;
        }
        if(cntr==3)
        {
            System.out.println("Yes");
            return;
        }
    }
    if((vis[0][0]&&vis[1][1]&&vis[2][2])||(vis[1][1]&&vis[0][2]&&vis[2][0]))
    {
        System.out.println("Yes");
        return;
    }
    System.out.println("No");
  }
}
