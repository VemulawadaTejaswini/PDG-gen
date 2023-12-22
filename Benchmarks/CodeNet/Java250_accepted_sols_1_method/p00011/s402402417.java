import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[\\n,]");
		int l_num = scanner.nextInt();
		int w_num = scanner.nextInt();
		int[] ans = new int[l_num];
		int tmp;
		for(int i=0; i<l_num; i++){
			ans[i] = i+1;
		}
		int[] change = new int[2*w_num];
		for(int i=0; i <w_num ; i++){
			change[i*2] = scanner.nextInt();
			change[(i*2)+1] = scanner.nextInt();
		}
		for(int i=0; i<w_num ; i++){
			tmp = ans[change[i*2]-1];
			ans[change[i*2]-1] = ans[change[i*2+1]-1];
			ans[change[i*2+1]-1] = tmp;		
		}
		for(int i=0; i<l_num; i++){
			System.out.println(ans[i]);
		}
	}
}