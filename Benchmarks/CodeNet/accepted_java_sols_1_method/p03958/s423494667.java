import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[t];
		for(int i=0; i<t; i++){
			a[i] = sc.nextInt();
		}
		int max = 0;
		
		for(int i=0; i<t; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		if(max <= k-max){
			System.out.println(0);
		}else{
			System.out.println(max*2 - k - 1);
		}
		sc.close();
	}

}