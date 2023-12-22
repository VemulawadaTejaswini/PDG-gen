import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[7];
		
		for(int i = 0 ; i < a.length ; i++){
			int s = sc.nextInt();
			int f = sc.nextInt();
			a[i] = s - (f);
		}
		for (int x : a){
			System.out.println(x);
		}
		
		
		sc.close();
	}

}