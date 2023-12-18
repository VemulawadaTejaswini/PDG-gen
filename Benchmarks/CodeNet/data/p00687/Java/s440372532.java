import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		boolean [] data = new boolean[1000001];
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			Arrays.fill(data, false);
			if(n==0 && a == 0 && b == 0){
				break;
			}
			data[0] = true;
			int count = 0;

			for(int i=0; i <= n; i++){
				if(data[i]){
					if(i + a <= n) data[i+a] = true;
					if(i + b <= n) data[i+b] = true;
				}
				else{
					count++;
				}
			}
			System.out.println(count);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}