import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int ans = 0;
		
		int k = ((l-1)/2019 + 1)*2019; //L <= k
		if(l == 0){
			k = 0;
		}

		if(k <= r){
			ans = 0;
		}else{
			ans = 2018;
			int min = l % 2019;
			int max = r % 2019;
			for(int i = min ; i < max ; i++)
			{
				for(int j = i+1 ; j <= max ; j++){
					ans = ans > ((i*j) % 2019) ?  ((i*j) % 2019) : ans;
				}
			}
		}

		System.out.println(ans);
	}

}