
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int t = in.nextInt();
		int[] a = new int[t];
		
		int  max = 0;
		int sum = 0;
		for(int i =0;i<t;i++){
			a[i] = in.nextInt();
			sum+=a[i];
			if(a[i]>max) max = a[i];
		}
		if(max<=sum-max+1){
			System.out.println(0);
			return;
		}
		else{
			System.out.println(2*max-sum-1);
			return;
		}
	}

}
