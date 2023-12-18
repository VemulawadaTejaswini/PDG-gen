
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int count = 0;
		int[] ary = new int[100001];
		ary[0] = 0;
		while(i < 9){
			i++;
			count++;
			ary[i] = count;
		}
		while(i < 99){
			i++;
			ary[i] = count;
		}
		while(i < 999){
			i++;
			count++;
			ary[i] = count;
		}
		while(i < 9999){
			i++;
			ary[i] = count;
		}
		while(i < 99999){
			i++;
			count++;
			ary[i] = count;
		}
		i++;
		ary[i] = count;
		System.out.println(ary[n]);
	}
}
