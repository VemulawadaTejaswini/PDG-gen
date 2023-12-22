import java.util.*;
 
 
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int k = 0; k<n; k++) arr[k] = sc.nextInt(); //Reading inputs
   
        for( int i=0; i<n;i++)
        {
            int key = arr[i];
            int j  = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;    
                for(int k = 0; k<n; k++) 
                {
                    if(k<n-1) System.out.printf("%d ",arr[k]);
                    else System.out.println(arr[k]);  
                }
                
        }
    }
}   
