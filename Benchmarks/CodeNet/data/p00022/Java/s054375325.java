import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0){
			int kazu[] = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){
				kazu[i]=sc.nextInt();
				sum += kazu[i];
			}
			System.out.println(sum);
			n = sc.nextInt();
		}
	}
}