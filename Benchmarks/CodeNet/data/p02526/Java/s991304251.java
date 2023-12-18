import java.util.Scanner;

public class aoj10031 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		int n = in.nextInt();
		int[]S = new int [100000];
		int[]T = new int [50000];
		for(int i = 0;i < n;i++){
			S[i] = in.nextInt();
		}
		int q = in.nextInt();
		for(int i = 0;i < q;i++){
			T[i] = in.nextInt();
		}
		for(int i = 0;i < q;i++){
			for(int j = 0;j < n;j++){
				if(T[i] == S[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}