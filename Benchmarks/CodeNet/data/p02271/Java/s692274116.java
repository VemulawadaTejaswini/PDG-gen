

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int mm = in.nextInt();
		int[] b = new int[mm];
		for(int i = 0;  i < mm; i++){
			b[i] = in.nextInt();
		}

		for(int m : b){
			if(canCalc(a,0,0,m)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		in.close();
	}
	boolean canCalc(int[] a,int i,int sum, int m){
		sum += a[i];
		if(sum == m) return true;
		boolean isOk = false;

		for(int j = i+1; j < a.length; j++){
			if(sum < m){
				isOk = canCalc(a, j, sum, m);
				if(isOk)break;
			}else{
				break;
			}
		}
		if(isOk) return true;
		sum -= a[i];
		for(int j = i+1; j < a.length; j++){
			if(sum < m){
				isOk = canCalc(a, j, sum, m);
				if(isOk)break;
			}else{
				break;
			}
		}
		if(isOk) return true;
		else return false;
	}
}