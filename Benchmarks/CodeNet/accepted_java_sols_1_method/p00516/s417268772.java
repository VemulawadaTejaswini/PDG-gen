import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] game = new int [N];
		int [] vote = new int [N];
		int M = in.nextInt();
		int [] member = new int [M];
		for(int i = 0; i < N; i++){
			game[i] = in.nextInt();
		}
		for(int i = 0; i < M; i++){
			member[i] = in.nextInt();
		}
		for(int i = 0; i < M; i++){
			for(int k = 0; k < N; k++){
				if(game[k] <= member[i]){
					vote[k]++;
					break;
				}
			}
		}
		int max = 0;
		int idx = 0;
		for(int i = 0; i < N; i++){
			if(max < vote[i]){
				max = vote[i];
				idx = i;
			}
		}
		System.out.println(idx + 1);
	}

}