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
        List<BigInteger> list = new ArrayList<>();
        BigInteger val = new BigInteger("1");
        int start=0;
        for(int i=0;i<n;i++)
        {
            int value = sc.nextInt();
            arr[i]=value;
            if(i>=k)
            {
                val = val.divide(BigInteger.valueOf(arr[start]));
                start++;
            }
            val = val.multiply(BigInteger.valueOf(value));
            list.add(val);
        }
        System.out.println(list);
        for(int i=k;i<n;i++)
        {
            if(list.get(i).compareTo(list.get(i-1))>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

    }
}