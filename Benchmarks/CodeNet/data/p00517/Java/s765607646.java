import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int answer = 0;
		for(int i=1;i<n;i++){
			if(x[i-1]<=x[i] && y[i-1]<= y[i]){
				answer += Math.max(x[i]-x[i-1],y[i]-y[i-1]);
			} else if(x[i-1]>=x[i] && y[i-1]>=y[i]){
				answer += Math.max(x[i-1]-x[i], y[i-1]-y[i]);
			} else {
				answer += Math.abs(x[i-1]-x[i]) + Math.abs(y[i-1]-y[i]);
			}
		}
		System.out.println(answer);
	}

}