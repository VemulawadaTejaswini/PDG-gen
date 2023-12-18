import java.util. *;

public class pra{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i;
		int n = scan.nextInt();
		int[] date = new int[n];
		
		for(i = 0; i < n; i++){
			date[i] = scan.nextInt();
		}
		
		for(i = n - 1; i >= 0; i--){
			System.out.print(date[i] + " ");
		}
	}
}