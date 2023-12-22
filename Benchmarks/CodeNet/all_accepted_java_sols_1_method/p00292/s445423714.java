import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			int k = sc.nextInt();
			int p = sc.nextInt();
			if(k % p == 0){
				a[i] = p;
			} else {
				a[i] = k % p;
			}
		}
		for(int j : a){
			System.out.println(j);
		}
		sc.close();
	}

}