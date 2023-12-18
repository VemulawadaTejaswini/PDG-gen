import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int n = sc.nextInt();//枚数
			int r = sc.nextInt();//回数
			if(0==n && 0==r) break;
			int[] huda = new int[n];
			for(int j=0;j<n;j++) huda[j] = j+1;

			for(int j=0;j<r;j++){
				int p = sc.nextInt();//上から何枚
				int c = sc.nextInt();//ここまで
				int[] temp = new int[p];
				for(int l=0;l<p;l++) temp[l] = huda[l];
				for(int x=0;x<c;x++) huda[x] = huda[x+p-1];
				for(int y=0;y<p;y++) huda[c+y] = temp[y];
			}
			System.out.println(huda[0]);
		}
	}
}
