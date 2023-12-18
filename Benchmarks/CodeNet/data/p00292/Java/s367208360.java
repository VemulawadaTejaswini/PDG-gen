import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] k = new int[n];
		int[] p = new int[n];
		for(int i = 0 ; i<n ; i++){
			k[i] = scan.nextInt();
			p[i] = scan.nextInt();
		}
		for(int i = 0 ; i<n ; i++){
			if(k[i]%p[i] == 0){
				System.out.println(p[i]);
			}else{
				System.out.println(k[i]%p[i]);
			}
		}
	}
}