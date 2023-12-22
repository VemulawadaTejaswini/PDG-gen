import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] ans = new Integer[N];
		for(int n = 0; n < N; n++){
			ans[n] = sc.nextInt();
		}
		sc.close();
		int sunuke = 0;
		for (int an = 0; an < ans.length; an++){
			if (ans[an] == sunuke + 1){
				sunuke++;
			}
		}
		if (sunuke == 0){
			System.out.println("-1");
		}else{
		System.out.println(N-sunuke);
		}
	}}