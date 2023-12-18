import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      Main o=new Main();
      o.main();
      o.flush();
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,k;
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int c=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]!=arr[j])
                {
                for(k=j+1;k<n;k++)
                {
                    if(arr[j]!=arr[k] && arr[i]!=arr[k])
                    {
                        if((arr[i]+arr[j]>arr[k]) && (arr[i]+arr[k]>arr[j]) && (arr[j]+arr[k]>arr[i]))
                        c++;
                    }
                }
                }
            }
        }
        println(c);
        sc.close();
    }
}