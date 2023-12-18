
import java.util.*;


class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        int ct = 0; int idx;
        for(int i = 0; i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n;i++)
        {
            idx = 0;
            int min = arr[i];
            for(int j = i+1 ;j<n;j++)
            {
                if(min>arr[j])
                {
                    min = arr[j];
                    idx = j;
                } 
            }
            if(min !=arr[i])
            {
                ct++;
                int temp = arr[i];
                arr[i] = min;
                arr[idx] = temp;
            }
        }
          for(int i = 0; i<n;i++) 
          {
              if(i==n-1) 
              {
                  System.out.println(arr[i]); break;
              }
              
              System.out.printf("%d ", arr[i]);
          }
          System.out.println(ct);
    }
}
       



