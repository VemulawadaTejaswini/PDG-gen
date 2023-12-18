import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d[] = new int[100];
		for(int i = 0; i < n; i++){
			d[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(d[i] < d[j]){
					d[i] = d[j];
				}
			}
		}
		for(int i = 0; i < n; i++){
			if((d[i] / b) > (c / a)){
				c += d[i];
				a += b;
			}
		}
		System.out.println(c / a);
	}
}