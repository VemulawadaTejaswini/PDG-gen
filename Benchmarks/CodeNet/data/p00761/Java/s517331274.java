import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int a0 = sc.nextInt();
			int l = sc.nextInt();
			if(a0 == 0 && l == 0) break;
			calc(a0, l);
		}
	}

	public void calc(int a0, int l){
		int[] hairetsu = new int[(int) Math.pow(10, l)];
		Arrays.fill(hairetsu, -1);
		hairetsu[a0] = 0;
		int a = a0;
		int j = 1;
		while(true){
			int[] num = new int[10];
			for(int i = l-1; i > -1; i--){
				int hikaku = (int)Math.pow(10, i);
				if(hikaku > a) num[0] = num[0] + 1;
				else{
					int t = a / hikaku;
					num[t] = num[t] + 1;
					a = a - (t * hikaku);
				}
			}
			int max = 0;
			int min = 0;
			int count = l-1;
			int count2 = 0;
			for(int i = 9; i > -1; i--){
				while(num[i] > 0){
					max = max + ((int)Math.pow(10, count)) * i;
					min = min + ((int)Math.pow(10, count2)) * i;
					num[i] = num[i] - 1;
					count--;
					count2++;
				}
				if(count == -1) break;
			}
			a = max - min;
			if(hairetsu[a] != -1){
				System.out.println(hairetsu[a] + " " + a + " " + (j - hairetsu[a]));
				break;
			}
			else{
				hairetsu[a] = j;
				j++;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}