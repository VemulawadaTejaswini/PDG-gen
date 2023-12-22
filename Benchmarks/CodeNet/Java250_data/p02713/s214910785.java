import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
	
	static long GCD(long A, long B, long C)
	{
		long Result = A;
		Result = gcd(Result, B);
		Result = gcd(Result, C);
		return Result;
	}
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		long K = Long.parseLong(BR.readLine()), Sum = 0;
		for (long i = 1; i <= K; i++)
			for (long j = 1; j <= K; j++)
				for (long k = 1; k <= K; k++)
					Sum += GCD(i, j, k);
		System.out.println(Sum);
	}
}
