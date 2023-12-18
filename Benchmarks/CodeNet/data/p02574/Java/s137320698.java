import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		sieve();
		
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int gcd=arr[0];
		
		for(int i=0;i<n;i++)
		{
			gcd=gcd(gcd,arr[i]);
		}
		
		if(gcd>1)
		{
			System.out.println("not coprime");
		}
		else if(gcd==1)
		{
			HashMap<Integer,Integer> map=new HashMap<>();
			
			int p=0;
			
			for(int i=0;i<n;i++)
			{
				HashMap<Integer,Integer> temp=getFactorization(arr[i]);
				
				for(Map.Entry<Integer,Integer> entry:temp.entrySet())
				{
					if(map.containsKey(entry.getKey()))
					{
						p=1;
						break;
					}
					else
					{
						map.put(entry.getKey(), 1);
					}
				}
				
				if(p==1)
				{
					break;
				}
			}
			
			if(p==1)
			{
				System.out.println("setwise coprime");
			}
			else
			{
				System.out.println("pairwise coprime");
			}
		}
		
	}
	
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		
		return gcd(b,a%b);
	}
	
	static final int MAXN = 1000001; 
    
    // stores smallest prime factor for every number 
    static int spf[] = new int[MAXN]; 
       
    // Calculating SPF (Smallest Prime Factor) for every 
    // number till MAXN. 
    // Time Complexity : O(nloglogn) 
    static void sieve() 
    { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
       
            // marking smallest prime factor for every 
            // number to be itself. 
            spf[i] = i; 
       
        // separately marking spf for every even 
        // number as 2 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
            // checking if i is prime 
            if (spf[i] == i) 
            { 
                // marking SPF for all numbers divisible by i 
                for (int j=i*i; j<MAXN; j+=i) 
       
                    // marking spf[j] if it is not  
                    // previously marked 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
       
    // A O(log n) function returning primefactorization 
    // by dividing by smallest prime factor at every step 
    static HashMap<Integer,Integer> getFactorization(int x) 
    { 
        HashMap<Integer,Integer> map=new HashMap<>();
        
        while (x != 1) 
        { 
            map.put(spf[x],1);
            x = x / spf[x]; 
        } 
        return map; 
    } 
	
}