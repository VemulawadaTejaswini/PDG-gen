import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			String[] s = new String[n];
			int[] money = new int[n];

			for(int i=0;i<n;i++){
				s[i] = sc.next().replace("*",".");
				money[i] = sc.nextInt();
			}

			int sum = 0;
			while(m-- > 0){
				String tmp = sc.next();
				for(int i=0;i<n;i++){
					if(tmp.matches(s[i])) sum += money[i];
				}
			}

			System.out.println(sum);
		}
	}
}