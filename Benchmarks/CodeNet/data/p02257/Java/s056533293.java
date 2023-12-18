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
	
	public void conpute() {
		for(int i=0; i<n; i++) {
			int a=2;//割る数
			int flag=0;
			while(a<A[i]) {
				if(A[i]%a==0) flag++;
				a++;
			}
			if(flag==0) count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.conpute();
	}
}

