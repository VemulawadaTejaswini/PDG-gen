import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] hm = new int[n][3];
		int[] result = new int[n];
		
		for(int i =0;i<n;i++){
			result[i] = 0;
			for(int k=0;k<3;k++){
				hm[i][k]= sc.nextInt();
			}
		}
		
		for(int k =0;k<3;k++){
			for(int i=0;i<n;i++){
				int sum = hm[i][k];
				for(int j=0;j<n;j++)
					if(hm[i][k]==hm[j][k]&& i!=j)
						sum = 0;
				result[i] += sum;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(result[i]);
		}
	}
}