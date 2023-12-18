import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] mem;
		int MAX = 1000;
		int VAL = 4000;
		Scanner sc = new Scanner(System.in);
		mem = new int[VAL+1];
		for(int i=0;i<=MAX;i++) for(int j=0;j<=MAX;j++) {
			if( i+j <= VAL )mem[i+j]++;
		}
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			int cnt = 0;
			for(int i=0;i<=VAL;i++) for(int j=0;j<=VAL;j++) {
				if(i==n-j) cnt += mem[i] * mem[j];
			}
			System.out.println(cnt);
		}
	}
}