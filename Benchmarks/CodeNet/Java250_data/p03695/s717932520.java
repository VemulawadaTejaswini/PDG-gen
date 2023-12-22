import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		boolean[] flags = new boolean[8];
		int free = 0;
		for(int i=0;i<n;i++){
			int a = scn.nextInt();
			int code = colorCode(a);
			if(code == 8){
				free++;
			}else{
				flags[code] = true;
			}
		}

		int c = 0;
		for(int i=0;i<flags.length;i++){
			if(flags[i]){
				c++;
			}
		}

		int min = 0;
		if(n == free){
			min = 1;
		}else{
			min = c;
		}

		int max = c + free;

		System.out.println(min + " " + max);
	}

	private static int colorCode(int n){
		int[] rate = {1,400,800,1200,1600,2000,2400,2800,3200};
		int i;
		for(i=0;i<rate.length;i++){
			if(rate[i] <= n){
				continue;
			}else{
				break;
			}
		}
		return i-1;
	}
}
