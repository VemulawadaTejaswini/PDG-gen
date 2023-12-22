import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i =0; i < n; i++){
			int vn = sc.nextInt();
			v[i] = vn;
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			int cn = sc.nextInt();
			if(cn < v[i]){
				sum += (v[i] - cn);
			}
		}
		System.out.println(sum);
	}
}