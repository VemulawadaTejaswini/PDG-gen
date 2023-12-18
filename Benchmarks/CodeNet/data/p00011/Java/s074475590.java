import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] ab = new int[n][2];
		for(int i = 0; i < n; i++){
			String str = sc.next();
			String str2[] = str.split(",");
			for(int j = 0; j < 2; j++){
				ab[i][j] = Integer.parseInt(str2[j])-1;
			}
		}
		int[] data = new int[w];
		for(int i = 0; i < w; i++){
			data[i] = i+1;
		}
		for(int i = 0; i < n; i++){
			int work = data[ab[i][0]];
			data[ab[i][0]] = data[ab[i][1]];
			data[ab[i][1]] = work;
		}
		for(int dd : data){
			System.out.println(dd);
		}
	}
}

