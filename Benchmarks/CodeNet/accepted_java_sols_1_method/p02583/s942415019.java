import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = 0;
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		for(int i = 0; i < a; i++){
			for(int j = i + 1; j < a ; j++){
				for(int k = j + 1;k < a; k++){
					if((d[i] + d[j] > d[k]) && (d[i] + d[k] > d[j]) && (d[j] + d[k] > d[i]) && d[i] != d[j] && d[k] != d[j] && d[i] != d[k] ){
						b++;
                      // System.out.println(d[i] + "と" + d[j] + "と" + d[k]);
					}
				}
			}
		}
		System.out.println(b);
		
		
	}
}