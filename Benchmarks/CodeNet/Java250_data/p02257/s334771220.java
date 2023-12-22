import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int count=0;	//素数カウント変数
	int[] A;
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
	}
	
	//0で素数を返す
	public int conpute(int number) {
		if(number<2) return 0;
		if(number==2) return 0;
		if(number%2==0) return 1;
		double a = Math.sqrt(number);
		for(int i=3; i<=a; i++) {
			if(number%i == 0) return 1;
		}
		return 0;
	}
	
	public void output() {
		for(int i=0; i<n; i++) {
			if( conpute(A[i]) == 0 ) count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

