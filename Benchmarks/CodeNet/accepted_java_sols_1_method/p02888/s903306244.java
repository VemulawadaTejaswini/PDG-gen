import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[2000];

		for(int i = 0 ; i < n ; i++){
			l[i] = sc.nextInt();
		}
		for(int i = n ; i < 2000 ; i++){
			l[i] = 10000;
		}

		Arrays.sort(l);

		int ans = 0;

		for(int i = 0 ; i < n-2 ; i++){
			for(int j = i+1 ; j < n-1 ; j++){
				for(int k = j+1 ; (k < n) && (l[k] < l[i] + l[j]) ; k++){
					if(	(l[i] < l[j] + l[k]) &&
						(l[j] < l[k] + l[i])){
							ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}
}