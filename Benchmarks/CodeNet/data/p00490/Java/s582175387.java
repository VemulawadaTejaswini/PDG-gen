import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int tcal = c;
		int cnt = 0;
		int d[] = new int[100];
		for(int i = 0; i < n; i++){
			d[i] = in.nextInt();
			int tcaljn = tcal / a + b * cnt;
			int tcaln = tcal + d[i] / (a + b * (cnt + 1));
			if((c / a * 200 ) > d[i] * 100 / b){
				continue;
			}else if(tcaljn > tcaln){
				break;
			}
			tcal += d[i];
			cnt++;
		}
		System.out.println(tcal / (a + (cnt * b)));
	}
}