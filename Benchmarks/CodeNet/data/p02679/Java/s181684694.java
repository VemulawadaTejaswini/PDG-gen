import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static HashMap<String, Integer> g1 = new HashMap<>(); //+-
	static HashMap<String, Integer> g2 = new HashMap<>(); //-+
	static HashMap<String, Integer> g3 = new HashMap<>(); //++
	static HashMap<String, Integer> g4 = new HashMap<>(); //--
	
	static HashSet<String> set = new HashSet<>();
	
	static String tost(long a, long b)
	{
		if(a<0)a*=-1;
		if(b<0)b*=-1;
		long gd = gcd(a,b);
		a/=gd;
		b/=gd;
		
		if(a==b)return "s" + a + " " + b;
		return a + " " + b;
	}
	
    public static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b%a, a); 
    } 	
	static long MOD = 1000000007l;

	public static void main(String[] args) 
	{
		long[] pow2 = new long[300000];
		pow2[0] = 1;
		int zer = 0;
		
		for(int i = 1; i < 300000;i++)
		{
			pow2[i] = (pow2[i-1] * 2)%MOD;
			while(pow2[i]<0)pow2[i]+=MOD;
		}
		
		Scanner sc = new Scanner(System.in);

		
		int zerl = 0;
		int zerr = 0;
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			if(a == 0 && b == 0)
			{
				zer++;
				continue;
			}
			
			if(a == 0)
			{
				zerl++;
				continue;
			}
			else if(b==0)
			{
				zerr++;
				continue;
			}
			
			if(a > 0 && b < 0)
			{ //g1
				String s = tost(a,b);
				if(g1.containsKey(s))g1.put(s, g1.get(s)+1);
				else g1.put(s, 1);
				set.add(s);
			}
			
			else if(b > 0 && a < 0)
			{ //g2
				String s = tost(a,b);
				if(g2.containsKey(s))g2.put(s, g2.get(s)+1);
				else g2.put(s, 1);
				set.add(s);
			}
			
			else if(a > 0 && b > 0)
			{ //g3
				String s = tost(b,a);
				if(g3.containsKey(s))g3.put(s, g3.get(s)+1);
				else g3.put(s, 1);
				set.add(s);
			}
			else if(a < 0 && b < 0)
			{ //g4
				String s = tost(b,a);
				if(g4.containsKey(s))g4.put(s, g4.get(s)+1);
				else g4.put(s, 1);
				set.add(s);
			}

			
		}
		
		long an = 1;
		
		for(String s : set)
		{
//			System.out.println("do " + s);
			
			long cur = 1;
			int a = 0;
			int b = 0;
			
			/*
			if(s.charAt(0) == 's' && false)
			{
				int c = 0; int d = 0;
				if(g1.containsKey(s))c += g1.get(s);
				if(g2.containsKey(s))c += g2.get(s);
				if(g3.containsKey(s))a += g3.get(s);
				if(g4.containsKey(s))b += g4.get(s);
//				System.out.println(a + " " + b + " "+ c);
				
				long pa = (pow2[a]-1)%MOD;
				long pb = (pow2[b]-1)%MOD;
				long pc = (pow2[c]-1)%MOD;
				cur = (pa + pb + pc + 1)%MOD;
				an = (an * cur)%MOD;
//				System.out.println(pa + " " + pb + " " + pc);
				continue;
			}
			*/
			
			if(g1.containsKey(s))a = g1.get(s);
			if(g2.containsKey(s))a += g2.get(s);
			if(g3.containsKey(s))b += g3.get(s);
			if(g4.containsKey(s))b += g4.get(s);
			
			long pa = pow2[a]-1;
			long pb = pow2[b]-1;
			
			cur = (pa + pb + 1)%MOD;
			
			an = (an * cur)%MOD;
//			System.out.println("Cur: ratio " + s + ": amount " + a + " " + b);
//			System.out.println("Curscore " + cur);
		}
		
//		System.out.println("Before zer " + an);
		//zerl zerr
		{
			long cur = 1;
			
			long pa = pow2[zerl]-1;
			long pb = pow2[zerr]-1;
			
			cur = (pa + pb + 1)%MOD;
			
			an = (an * cur)%MOD;
		}
		
		an = an - 1;
		if(an<0)an+=MOD;
		an+=zer;
//		if(an == 0)an=1;
		System.out.println(an);
		
		//zeroes
	}

}
