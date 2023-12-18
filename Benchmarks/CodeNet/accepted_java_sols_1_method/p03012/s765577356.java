import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []array=new int[n];
		int goukei_a=0,goukei_b=0;
		for (int i = 0; i < n; i++) {
			array[i]=scan.nextInt();
			goukei_a+=array[i];
		}
		for(int i=0;i<n;i++){
			goukei_b+=array[i];
			goukei_a-=array[i];
			array[i]=goukei_a-goukei_b;
			if(array[i]<0){
				array[i]=-1*array[i];
			}

		}
		Arrays.sort(array);
		System.out.println(array[0]);

	}

}