import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		double c = sc.nextDouble();
		// 文字列の入力
		double[] d = new double[a];
		double[] e = new double[b];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextDouble();
		} 
		for(int i = 0; i < b; i++){
			e[i] = sc.nextDouble();
		}
		double g = 0;
		double h = 0;
		double m = 0;
       int p = 0;
		boolean o = true;
		boolean r = true;
		int q = 0;
		
		g = c;
		for(int i = 0; i < a + b + 1 && r; i++){
			q = i;
			r = false;
			if(i < a){
				g -= d[i];
			}
			else{
				g -= e[i - a];
			}
			if(g > 0){
				r = true;
			}
		}
		for(int i = q + 1; i < a + b + 2 && o; i++){
			p = i - 1;
          g = c;
			o = false;
			for(int j= 0; j < i && !o; j++){
				h = 0;
				m = 0;
				for(int k = 0; k < j; k++){
					h += d[k]; 
				}
				for(int l = 0; l < i - j; j++){
					m += e[l];
				}
				if(c - h - m > -1){
					o = true;
				}	
			}
		}
		// 出力a
		System.out.println(p);
	}
}