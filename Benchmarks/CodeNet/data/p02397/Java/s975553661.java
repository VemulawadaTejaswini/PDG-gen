import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		while(true) {
			for(int i = 0; i<2; i++) {
				 a[i] = sc.nextInt();
			}
		  Arrays.sort(a);

		 if(a[0]==0 && a[1] ==0)break;
		 System.out.println(a[0] +" " + a[1]);

		}


    }

}
