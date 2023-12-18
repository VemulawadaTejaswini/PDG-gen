import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long[] arr=findDivisors(n);
        for(int i=1;i<arr.length;i++){
            sum+=arr[i]*(i);
            
        }
        System.out.println(sum);
    }
    
    static long[] findDivisors(int n)  
    {  
        long[] div = new long[n + 1];  
        for (int i = 1; i <= n; i++)  
        {   
            for (int j = 1; j * i <= n; j++)  
                div[i * j]++;  
        }  
        return div;
    }  
}