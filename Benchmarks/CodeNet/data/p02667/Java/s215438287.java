import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	private static Map<String,Integer> intMap = new HashMap<>();
	private static Map<String,Integer> intMap2 = new HashMap<>();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char c[] = str.toCharArray();
		int n = c.length;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = numToInt(c[i]);
		}
		int ans = solve(a, n, str);
		System.out.println(ans);
	}
	public static int solve(int[] a, int n, String str)
	{
		if(intMap.containsKey(str)){
			return intMap.get(str);
		}
		if (n == 0) {
			return 0;
		}
		int ans = count(a, n, str);
		int ans2 = 0;

		int a2[] = new int[n-1];
		for (int i = 0; i < n; i++)
		{
			String str2 = newStr2(str, i);
			a2 = newA2(str2);
			ans2 = Math.max(ans2, solve(a2, n-1, str2));
		}
		intMap.put(str, ans+ans2);
		return ans+ans2;
	}

	private static int[] newA2(String str2)
	{
		char c[] = str2.toCharArray();
		int n = c.length;
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = numToInt(c[i]);
		}
		return a;
	}
	private static int[] newA(int[] a, int n, int i)
	{
		int a2[] = new int[n-1];
		int k =0;
		for (int j = 0; j < n; j++) {
			if (j != i) {
				a2[k]= a[j];
				k++;
			}
		}
		return a2;
	}
	private static String newStr(int[] a, int n, int i)
	{
	    StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++) {
			if (j != i) {
				sb.append(String.valueOf(a[j]));
			}
		}
		return sb.toString();
	}
	private static String newStr2(String str, int i)
	{
		if (i == 0) {
			return str.substring(1);
		} else if (i == str.length()) {
			return str.substring(0, str.length()-2);
		}
	    StringBuilder sb = new StringBuilder();
		sb.append(str.substring(0, i));
		sb.append(str.substring(i+1));
		return sb.toString();
	}


	private static int count(int[] a, int n, String str)
	{
		if(intMap2.containsKey(str)){
			return intMap2.get(str);
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (a[i] == 1) {
					ans += 1;
				}
			}
		}
		intMap2.put(str, ans);
		return ans;
	}
	static int numToInt(char a)
	{
		return a - '0';
	}

}
