import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = isDivisor(a, b, c);
		System.out.println(ans);
	}
	static int isDivisor(int a, int b, int c){
		int ans = 0;
		boolean array[] = new boolean[b + 1];
		for(int i = a; i <= b; i++){
			if(array[i]) continue;
			if(c % i == 0){
				array[i] = true;
				array[c / i] = true;
			}
		}
		
		for(int i = a; i <= b; i++){
			if(array[i]){
				ans++;
			}
		}
		return ans;
	}
}

//00:07 s	26320 KB	439 B