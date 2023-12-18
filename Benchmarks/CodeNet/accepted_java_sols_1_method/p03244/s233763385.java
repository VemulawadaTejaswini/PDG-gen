import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int counter = scanner.nextInt();
		int[] odd = new int[100001];
		int[] even = new int[100001];
		
		boolean bool = true;
		for(int i = 0;i<counter;i++) {
			if(bool) odd[scanner.nextInt()]++;
			else even[scanner.nextInt()]++;
			bool = !bool;
		}
		
		int a=0,b=0,c=0,d=0;
		
		for(int i = 0;i<100001;i++) {
			if(odd[i] > a) {
				a = odd[i];
				b = i;
			}
			if(even[i] > c) {
				c = even[i];
				d = i;
			}
		}
		
		bool = b == d;
		
		Arrays.sort(odd);
		Arrays.sort(even);
		
		if(!bool) {
			System.out.println(counter - odd[100000] - even[100000]);
		}else {
          System.out.println(Math.min(counter - odd[100000] - even[99999],counter - odd[99999] - even[100000]));
		}
	}
}