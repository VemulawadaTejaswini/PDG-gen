import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		int n = in.nextInt();
		int[]S = new int [100];
		int[]T = new int [100];
		for(int i = 0;i < n;i++){
			S[i] = in.nextInt();
		}
		int q = in.nextInt();
		for(int i = 0;i < q;i++){
			T[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < q;j++){
				if(S[i] == T[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}