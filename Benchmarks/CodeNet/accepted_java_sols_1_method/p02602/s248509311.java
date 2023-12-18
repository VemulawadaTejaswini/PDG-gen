import java.util.*;
import java.math.*;
class Main
{
    public static void main(String [] args)
    {
        Map<String,Integer> map =new HashMap<>();
        Scanner  sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] =new int[n];
        // List<BigInteger> list = new ArrayList<>();
        // BigInteger val = new BigInteger("1");
        int start=0;
        for(int i=0;i<n;i++)
        {
            int value = sc.nextInt();
            arr[i]=value;
        }
        // System.out.println(list);
        for(int i=k;i<n;i++)
        {
            if(arr[i]>arr[start])
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            start++;
        }

    }
}