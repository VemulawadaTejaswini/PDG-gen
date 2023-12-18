import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[][] array1 = new int[h][w];
		int[][] array2 = new int[w][h];
		int[] hArray = new int[m];
		int[] wArray = new int[m];
		for(int i=0;i<m;i++) {
			hArray[i]=sc.nextInt()-1;
			wArray[i]=sc.nextInt()-1;
			array1[hArray[i]][wArray[i]] = array1[hArray[i]][wArray[i]]+1;
			array2[wArray[i]][hArray[i]] = array2[wArray[i]][hArray[i]]+1;
		}
		sc.close();

		long ans1 = 0L;
		int aaa=0;
		for(int i=0;i<h;i++) {
			String str = Arrays.toString(array1[i]);
			int tmp = str.length()-str.replaceAll("1", "").length();
			if(tmp>ans1) {
				ans1 = tmp;
				aaa=i;
			}
		}

		long ans2 = 0L;
		int bbb=0;
		for(int i=0;i<w;i++) {
			String str = Arrays.toString(array2[i]);
			int tmp = str.length()-str.replaceAll("1", "").length();
			if(tmp>ans2) {
				ans2 = tmp;
				bbb=i;
			}
		}

		if(aaa!=bbb) {
			System.out.println(ans1+ans2-1);
		}else {
			System.out.println(ans1+ans2);
		}






	}
}
