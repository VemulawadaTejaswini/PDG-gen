import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, m;
		int[][] result;
		while((n = sc.nextInt()) != 0){
			m = sc.nextInt();
			result = new int[m][2];
			for(int i = 0; i < m; i++){
				result[i][1] = i + 1;
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					result[j][0] += sc.nextInt();
				}
			}
			Arrays.sort(result, new Comparator<int[]>(){
				public int compare(int[] a, int[] b){
					if(a[0] == b[0]){
						return a[1] - b[1];
					}
					return b[0] - a[0];
				}
			});
			System.out.print(result[0][1]);
			for(int i = 1; i < m; i++){
				System.out.print(" " + result[i][1]);
			}
			System.out.println();
		}
	}
}