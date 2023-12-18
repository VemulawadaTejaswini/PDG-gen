import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]k = new int[n];
		int[]s = new int[m];
		int[]count = new int[n];
		for(int i = 0; i < n; i++){
			k[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			s[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			count[i] = 0;
		}
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(s[i] >= k[j]){
					count[j] = count[j] + 1;
					break;
				}
			}
		}
		int h = 0;
		int c = 0;
		int i;
		for(i = 0; i < n; i++){
			if(h > count[i]){
			}else if(h < count[i]){
				h = count[i];
				c = i;
			}
		}
		System.out.println(c + 1);

	}

}