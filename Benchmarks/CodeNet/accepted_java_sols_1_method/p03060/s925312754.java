import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//データの数 
		int V[] = new int[N]; //配列数を決定
		int C[] = new int[N]; //配列数を決定
		//int ans[] = new int[N]; //配列数を決定
		int ans = 0;
		
		
		for(int i = 0; i<N; i++) {
			V[i] = sc.nextInt(); //配列の中身を挿入
			
		}
		
		for(int i = 0; i<N; i++) {
            C[i] = sc.nextInt(); //配列の中身を挿入
		}
		for(int i = 0;i<N;i++){
			if(V[i]>C[i])ans+=(V[i]-C[i]);
		}
		System.out.println(ans);
	}
}