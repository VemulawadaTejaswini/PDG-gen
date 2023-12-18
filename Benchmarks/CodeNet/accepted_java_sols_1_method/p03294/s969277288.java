import java.util.*;
import java.math.*;

public class Main{
	
	public static void main(String args[]){
		int n;
		int vet[] = new int[5010];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			vet[i] = sc.nextInt();
		}
		
		
		BigInteger b = new BigInteger(String.valueOf(vet[0]));
		BigInteger aux = new BigInteger("0");
		BigInteger aux2 = new BigInteger("0");
		for (int i = 1; i < n; i++)
		{
			aux = b.multiply(BigInteger.valueOf(vet[i]));
			aux2 = b.gcd(BigInteger.valueOf(vet[i]));
			b = aux.divide(aux2);
		}
		//~ System.out.println(b);
		
		b = b.subtract(BigInteger.ONE);
		long ans = 0;
		for (int i = 0; i < n; i++)
		{
			//~ System.out.println(b.mod(BigInteger.valueOf(vet[i])));
			ans += b.mod(BigInteger.valueOf(vet[i])).longValue();
		}
		System.out.println(ans);
	}
	
}
