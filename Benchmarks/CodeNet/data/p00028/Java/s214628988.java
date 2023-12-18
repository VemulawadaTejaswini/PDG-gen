import java.util.Scanner;

public class AOJ0028 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cnt[] = new int[100];
		
		while (input.hasNext()){
			int n = input.nextInt();
			cnt[--n]++;
		}
		
		int max = 0;
		for (int n : cnt){
			if (max < n){
				max = n;
			}
		}
		
		for (int i = 0; i < cnt.length; i++){
			if (cnt[i] == max){
				System.out.println(i + 1);
			}
		}
	}
}