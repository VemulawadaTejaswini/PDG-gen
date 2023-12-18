import java.util.*;
public class Main{
	static int MAXN = 1000001;  
	static int[] spf = new int[MAXN];  
	static int[] hash1 = new int[MAXN]; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(hasValidNum(arr,n)){
			System.out.println("pairwise coprime");
		}
		else if(findGCD(arr,n)==1){
			System.out.println("setwise coprime");
		}
		else{
			System.out.println("not coprime");
		}
	}
	static void sieve() { 
    spf[1] = 1; 
    for (int i = 2; i < MAXN; i++) 
        spf[i] = i; 
    for (int i = 4; i < MAXN; i += 2) 
        spf[i] = 2;  
    for (int i = 3; i * i < MAXN; i++)  
    {  
        if (spf[i] == i)  
        { 
            for (int j = i * i; j < MAXN; j += i) 
  
                // Marking spf[j] if it is not 
                // previously marked 
                if (spf[j] == j) 
                    spf[j] = i; 
        } 
    } 
}
    static void getFactorization(int x) { 
    int temp; 
    while (x != 1)  
    { 
        temp = spf[x]; 
        if (x % temp == 0)  
        { 
  
            // Storing the count of 
            // prime factors in hash 
            hash1[spf[x]]++; 
            x = x / spf[x]; 
        } 
        while (x % temp == 0) 
            x = x / temp; 
    } 
}

static boolean check(int x) 
{ 
    int temp; 
    while (x != 1)  
    { 
        temp = spf[x]; 
  
        // Checking whether it common 
        // prime factor with other numbers 
        if (x % temp == 0 && hash1[temp] > 1) 
            return false; 
        while (x % temp == 0) 
            x = x / temp; 
    } 
    return true; 
}
static boolean hasValidNum(int []arr, int n) 
{ 
  
    // Using sieve for generating prime factors 
    sieve(); 
  
    for (int i = 0; i < n; i++) 
        getFactorization(arr[i]); 
  
    // Checking the common prime factors 
    // with other numbers 
    for (int i = 0; i < n; i++) 
        if (!check(arr[i])) 
            return false; 
  
    return true; 
}
static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    // Function to find gcd of array of 
    // numbers 
    static int findGCD(int arr[], int n) 
    { 
        int result = 0; 
        for (int element: arr){ 
            result = gcd(result, element); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    }     
}
