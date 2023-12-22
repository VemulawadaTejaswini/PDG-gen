import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int l[] = new int[N];
		for(int i=0; i < l.length; i++){
			l[i] = sc.nextInt();
		}
		

		Arrays.sort(l);
		int ldo[] = new int[N];
		for(int i=0;i<l.length;i++){
			ldo[i] = l[l.length-1-i];
		}

		int ans = 0;
		for(int i=0;i<K;i++){
			ans += ldo[i];
		}

		System.out.println(ans);

	}
}


