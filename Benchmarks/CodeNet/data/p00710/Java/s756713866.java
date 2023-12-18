import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0) break;
			int[] num = new int[n];
			for(int i = 0; i < n; i++) 
				num[i] = n - i;
			int p, c;
			for(int i = 0; i < r; i++){
				p = sc.nextInt();
				c = sc.nextInt();
				int[] tmp = new int[p];
				for(int j = 0; j < p ; j++)
					tmp[j] = num[j];
				//-----
				for(int j = 0; j < c; j++){
					num[j] = num[p - 1 + j];
				}
				for(int j = 0; j < tmp.length; j++){
					num[c + j] = tmp[j];
				}
			}
			System.out.println(num[0]);
		}

	}
}