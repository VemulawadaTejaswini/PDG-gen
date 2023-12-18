import java.util.*;

public class mondai7 {
	public static void main(String[] args){
		int n, l, r, d, p= 0, t = 0, x = 0, kiroku = 0, max =0, max2 = 0, hensu = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] ten = new int[n];
		int[] byou = new int[n];
		r = scan.nextInt();
		int[] ban = new int[r];
		l = scan.nextInt();
		for(int i = 0; i < r; i++){
			d = scan.nextInt();
			t = scan.nextInt();
			x = scan.nextInt();
 			if(i == 0){
				kiroku = t;
				byou[0] = t;
			}
			ten[d-1] = ten[d-1] + x;
			//maxbanのひとつまえを入力
			for(int j = 1; j < n; j++){
				if(ten[max] < ten[j]){
					max = j;
				}
			}
			ban[p] = max;
			if(i > 0){
				byou[ban[p-1]] = byou[ban[p-1]] + t - kiroku;
			}
			kiroku = t;
			hensu = max;
			max = 0;
			p = p + 1;
		}
		byou[hensu] = byou[hensu] + (l - t);
		for(int k = 1; k < n; k++){
			if(byou[max2] < byou[k]){
				max2 = k;
			}
		}
		System.out.println(max2 + 1);
	}
}