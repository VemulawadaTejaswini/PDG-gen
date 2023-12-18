import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), m=sc.nextInt();
			if(n == 0 && m == 0) break;

			int map[] = new int[n+2];
			boolean zero=false;

			while(m-- > 0) map[sc.nextInt()] = 1;
			if(map[0] == 1){
				map[0] = 0;
				zero = true;
			}

			int max = 0;
			for(int i=1;i<=n;i++){
				if(map[i+1] == 0){
					max = Math.max(max,map[i]);
					for(int j=i-1;map[j]!=0;j--) map[j] = map[i];
				}
				else{ map[i+1] += map[i]; }
			}

			if(zero){
				for(int i=1;i<=n;i++){
					if(map[i] == 0){
						int sum = map[i-1] + map[i+1] + 1;
						max = Math.max(max,sum);
					}
				}
			}

			System.out.println(max);
		}
	}
}