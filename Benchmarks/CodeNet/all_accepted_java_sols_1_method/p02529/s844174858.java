import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int n, q;
		int[] s, t;
		boolean[] same;
		int count = 0;
		
		n = stdIn.nextInt();
		s = new int[n];
		for (int i = 0; i < n; i++){
			s[i] = stdIn.nextInt();
		}
		
		q = stdIn.nextInt();
		t = new int[q];
		same = new boolean[(n > q ? n : q) + 1];
		for (int i = 0; i < q; i++){
			t[i] = stdIn.nextInt();
			for (int j = 0; j < n; j++){
				if (t[i] == s[j] && !same[s[j]]){
					same[s[j]] = true;
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}