import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		int k;
		int [] kyogi = new int[n];
		int [] kyogi2 = new int[n];
		int [] sinsa = new int[m];
		for(int i = 0; i < n; i++) {
			kyogi[i] = sc.nextInt();
		}
		for(int j = 0; j < m; j++) {
			sinsa[j] = sc.nextInt();
		}
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < n; i++) {
				if(kyogi[i] <= sinsa[j]) {
					kyogi2[i]++;
					break;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(i == 0 || kyogi2[i] > max) {
				max = kyogi2[i];
			}
		}
		for(k = 0; k < n; k++) {
			if(max == kyogi2[k]){
				break;
			}
		}
		System.out.println(k + 1);
	}

}