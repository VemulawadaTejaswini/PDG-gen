import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cn2 = 0;
		int count= 0;
		int L[] = new int [2*N];
		int TMP;
		for(int cn = 0 ; cn < 2*N;cn++)
		{
			L[cn] = sc.nextInt();
		}
		cn2 = L.length;
		Arrays.sort(L);
		while(true)
		{
			TMP = cn2 % 2;
			if(TMP == 0)
			{
				count = count + L[cn2 - 2];
				cn2 = cn2 - 2;
			}
			else
			{
				count = count + L[cn2 - 1];
				cn2 = cn2 - 1;
			}
			if(cn2 == 0)
			{
				break;
			}
		}
		System.out.println(count);
	}
}
