import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[101];
		int max = 0;
		while(sc.hasNext()){
			int num = sc.nextInt();
			cnt[num]++;
			if(max < cnt[num]) max = cnt[num];
		}
		for (int i = 0; i < cnt.length; i++) {
			if (max == cnt[i]) System.out.println(i);
		}
	}
}