import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		run();
	}
	static void run(){
		
		int n, tmp, count;
		int[] a = new int[100];
		
		boolean flag;
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		
		flag = true;
		
		count = 0;
		
		while(flag){
			flag = false;
			for(int i = n - 1; i > 0; i--){
				if(a[i] < a[i - 1]){
					tmp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = tmp;
					flag = true;
					count++;
				}
			}
		}
		for(int i = 0; i < n; i++){
			if(i == n - 1){
				System.out.println(a[i]);
			}else{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println(count);
	}
}