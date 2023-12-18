import java.math.BigInteger; 
import java.util.Scanner; 
class answer
{
   public BigInteger product(long Arr[]) 
    { 
        BigInteger f = new BigInteger("1"); 
        for (int i = 0; i <Arr.length; i++) 
            f = f.multiply(BigInteger.valueOf(Arr[i])); 
     if(f> Math.pow(10,18) return -1;
        return f; 
    } 
  public static void main(String args[]) throws Exception 
    { 
      int n;
      long x;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
        long arr[] = new long[n];
      for(int i=0;i<n;i++)
      x= sc.nextLong();
        System.out.println(product(arr)); 
    } 
        }