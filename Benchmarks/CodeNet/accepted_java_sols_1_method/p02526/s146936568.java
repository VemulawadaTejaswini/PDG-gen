import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		int n = in.nextInt();
		int[]S = new int [10000001];
		int idx;
		for(int i = 0;i < n;i++){
			idx = in.nextInt();
			S[idx] = 1;
		}
		int q = in.nextInt();
		for(int i = 0;i < q;i++){
			idx = in.nextInt();
			if(S[idx] == 1){
				count++;
			}
		}
		System.out.println(count);
	}
}