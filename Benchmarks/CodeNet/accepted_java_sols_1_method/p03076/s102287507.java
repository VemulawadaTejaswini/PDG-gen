
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int min=10;
		int sum = 0;
		for(int i=0; i<5; i++){
			a[i] = Integer.parseInt(sc.next());
			int tmp_min = a[i]%10;
			if(tmp_min != 0 && tmp_min<min)min = tmp_min;
			sum += a[i];
			if(tmp_min>0)sum += 10-tmp_min;
		}
		int ans = sum - 10 + min;
		
			System.out.println(ans);

		sc.close();
	}
	
}
