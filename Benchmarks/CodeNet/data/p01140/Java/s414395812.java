import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			else calc(n, m);
			
		}
	}
	public void calc(int n, int m){
		int[] h = new int[n+1];
		int[] w = new int[m+1];
		int maxH = 0;
		int maxW = 0;
		for(int i = 1; i < n+1; i++){
			h[i] = sc.nextInt();
			maxH += h[i];
		}
		for(int i = 1; i < m+1; i++){
			w[i] = sc.nextInt();
			maxW += w[i];
		}
		int[] habaNumH = new int[maxH + 1];
		int[] habaNumW = new int[maxW + 1];
		for(int i = 1; i < n+1; i++){
			int t = 0;
			for(int j = i; j < n+1; j++){
				t = t + h[j];
				habaNumH[t] += 1;
			}
		}
		for(int i = 1; i < m+1; i++){
			int t = 0;
			for(int j = i; j < m+1; j++){
				t = t + w[j];
				habaNumW[t] += 1;
			}
		}
		int haba;
		if(maxH < maxW) haba = maxH;
		else haba = maxW;
		int sum = 0;
		for(int i = 1; i < haba + 1; i++){
			sum += habaNumH[i] * habaNumW[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}