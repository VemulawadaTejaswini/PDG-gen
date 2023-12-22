import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pow = 1;
		int[] num = {3,5,7};
		for(int i=1; i<=9; i++){
			pow *= 3;
			for(int j=0; j<=pow; j++){
				int[] check753 = {0,0,0};
				int num753 = 0;
				int p = j;
				int q;
				int o = 1;
				for(int k=0; k<i; k++){
					q = p % 3;
					num753 += num[q] * o;
					check753[q]++;
					p = (p-q)/3;
					o *= 10;
				}
				if(num753 > n){
					break;
				}
				int checker = 1;
				for(int k=0; k<3; k++){
					checker *= check753[k];
				}
				if(checker > 0){
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}
}