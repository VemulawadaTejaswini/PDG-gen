
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int ans[] = new int[2*k-1];
		int index=0;
		for(int i = k-1; i>0;i--) {
			ans[index]=x-i;
			index++;
		}
		for(int i = 0; i < k; i++) {
			ans[index]=x+i;
			index++;
		}
		for(int i = 0; i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}


	}

}