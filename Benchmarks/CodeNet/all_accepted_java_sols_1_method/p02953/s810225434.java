
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		boolean can = true;
		boolean down1 = true;
		for(int i = 1; i < n; i++){
			int now = ary[i];
			int before = ary[i - 1];
			if(down1){
				before--;
			}
			if(before < now){
				down1 = true;
				continue;
			}
			if(before == now){
				down1 = false;
				continue;
			}
			if(before > now){
				can = false;
				break;
			}
		}
		System.out.println(can ? "Yes" : "No");
	}
}
