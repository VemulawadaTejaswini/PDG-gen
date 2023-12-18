import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int pairs = n*(n-1)/2;
        if(numOfPairs(a,n)==pairs)
            System.out.println("pairwise coprime");
        else if(findGCD(a,n)==1)
            System.out.println("setwise coprime");
        else{
            System.out.println("not coprime");
        }
    }
    static boolean coprime(int a, int b) 
    { 
        return (gcd(a, b) == 1); 
    } 
    static int numOfPairs(int arr[], int n)  
    {  
          
        int count = 0;  
        for (int i = 0; i < n - 1; i++)  
            for (int j = i + 1; j < n; j++) 
                if (coprime(arr[i], arr[j])) 
                    count++; 
                      
        return count; 
    } 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
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