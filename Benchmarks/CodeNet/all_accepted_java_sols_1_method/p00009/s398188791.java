import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		int f[] = new int[1000000];
		Arrays.fill(f,1);
		for(int i = 2;i < 1000000;i++){
			if(f[i] == 1){
				for(int j = i*2;j < 1000000;j+=i){
					f[j] = 0;
				}
			}
		}
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.next());
			int m = 0;
			for(int i = 2;i <= n;i++){
				m += f[i];
			}
			System.out.println(m);
		}
		System.exit(0);
	}
}