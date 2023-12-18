import java.io.*; 
import java.util.*; 
class Main { 
  static long maxProductSubarrayOfSizeK(long A[], int n, int k, long mod) 
  { 
    Arrays.sort(A); 
    long product = 1; 
    if (A[n - 1] == 0 && k % 2 != 0) 
      return 0;  
    if (A[n - 1] <= 0 && k % 2 != 0) { 
      for (int i = n - 1; i >= n - k; i--) 
        product = (product*A[i])%mod; 
      return (product+mod)%mod; 
    } 
    int i = 0; 
    int j = n - 1;
    if (k % 2 != 0) { 
      product = (product*A[j])%mod; 
      j--; 
      k--; 
    } 

    k >>= 1;  
    for (int itr = 0; itr < k; itr++) { 
      long left_product = (A[i] * A[i + 1])%mod; 
      long right_product = (A[j] * A[j - 1])%mod; 
      if (left_product > right_product) { 
        product = (product* left_product)%mod; 
        i += 2; 
      } 
      else { 
        product =(product*right_product)%mod; 
        j -= 2; 
      } 
    } 
    return (product+mod)%mod;
  } 

  public static void main(String[] args) 
  { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    int k = sc.nextInt();
    for(int i=0;i<n;i++){
      arr[i]=sc.nextLong();
    }
    long mod = 1000000007;
    System.out.println(maxProductSubarrayOfSizeK(arr, n, k,mod)); 
  } 
} 