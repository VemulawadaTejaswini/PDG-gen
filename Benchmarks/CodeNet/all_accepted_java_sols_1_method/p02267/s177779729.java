import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		int n = Integer.parseInt(scanner.nextLine());
		int[] data1 = new int[10500];
		for(int i = 0; i < n; i++){
			data1[i] = scanner.nextInt();
		}
		String nothing = scanner.nextLine();

		int q = Integer.parseInt(scanner.nextLine());
		int[] data2 = new int[q];
		for(int i = 0; i < q; i++){
			data2[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < q; i++){
			data1[n + i] = data2[i];
			int j = 0;
			while(data1[j] != data2[i]){
				j++;
			}
			if(j != n + i){
				answer++;
			}
		}
		System.out.println(answer);

	}
}