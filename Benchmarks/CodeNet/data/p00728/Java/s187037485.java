import java.util.Scanner;


public class Main {
	
	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) return ;
			int[] dx = new int[1001];
			int tmp = sc.nextInt(), max, min;
			max = tmp;
			min = tmp;
			dx[0] = tmp;
			boolean maxb = true, minb = true;
			for(int i = 1; i < n; i++){
				tmp = sc.nextInt();
				dx[i] = tmp;
				if(max < tmp) max = tmp;
				if(min > tmp) min = tmp;
			}
			int sum = 0;
			for(int i = 0; i < n; i++){
				if(max == dx[i] && maxb) maxb = false;
				else if(min == dx[i] && minb) minb = false;
				else sum += dx[i];
			}
			System.out.println(sum / (n - 2));
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}