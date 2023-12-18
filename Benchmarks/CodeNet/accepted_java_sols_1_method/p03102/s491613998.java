import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;
		int[] b = new int[m];
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			int tmp = c;
			for (int j = 0; j < m; j++){
				tmp += sc.nextInt() * b[j];
			}
			if(tmp > 0){
				res ++;
			}
		}
		System.out.println(res);
 	}
}


