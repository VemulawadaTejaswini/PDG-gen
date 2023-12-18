import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[10];
		int[] ans = new int[10];
		
		int tmp;
		int p = 0;
		int p2 = 0;
		
		while(scanner.hasNext()){
			tmp = scanner.nextInt();
			if(tmp != 0){
				input[p] = tmp;
				p++;
			}else{
				ans[p2] = input[p-1];
				p2++;
				p--;
			}
			if(p == 0){
				for(int j=0; j<p2; j++){
					System.out.println(ans[j]);
				}
			}
		}
	}
}