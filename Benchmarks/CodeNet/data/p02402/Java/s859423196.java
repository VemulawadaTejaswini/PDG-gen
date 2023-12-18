import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n, ai;
		int a, goukei = 0;
		n = br.readLine();
		ai = br.readLine();
		
		a = Integer.parseInt(n);
		
		String [] hairetsu = ai.split(" ");
		
		int ary[] = new int[a];
		
		for(int i = 0; i < ary.length; i++) {
			ary[i] = Integer.parseInt(hairetsu[i]);
		}
		
		for(int i = 0; i < a - 1; i++) {
			for(int j = i + 1; j < a; j++) {
				if(ary[i] > ary[j]) {
					int kakunou = ary[i];
					ary[i] = ary[j];
					ary[j] = kakunou;	
				}
			}
		}
		
		for(int i = 0; i < ary.length; i++) {
			goukei = goukei + ary[i];
		}
		
		System.out.println(ary[0] + " " + ary[ary.length - 1] + " " + goukei);
		

	}
}