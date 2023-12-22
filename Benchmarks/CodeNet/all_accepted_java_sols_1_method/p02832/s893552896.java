import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
        a[i] = input.nextInt();
        
    int g=0,h=1,i=0;
    boolean flag = false;
    while(i<n)
    {
        if(a[i]==h)
        {
            flag = true;
            h++;
            g++;
        }
        i++;
    }
    if(!flag)
        System.out.println(-1);
    else
        System.out.println(n-g);
  }
}
