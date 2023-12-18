import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		int n = in.nextInt();
		int[]S = new int [n];
		for(int i = 0;i < n;i++){
			S[i] = in.nextInt();
		}
		Arrays.sort(S);
		int q = in.nextInt();
		int[]T = new int [q];
		for(int i = 0;i < q;i++){
			T[i] = in.nextInt();
		}
		Arrays.sort(T);
		int j = 0;
		for(int i = 0;i < q;i++){
			while(j < n){
				if(T[i] == S[j]){
					count++;
					break;
				}
				else if(T[i] < S[j]){
					break;
				}
				j++;
			}
		}
		System.out.println(count);
	}
}