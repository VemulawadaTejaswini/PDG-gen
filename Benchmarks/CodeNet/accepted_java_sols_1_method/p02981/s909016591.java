import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s=sc.next();
		//String[] t=new String[4];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long count=0;
		long count1=0;
		int[] array = new int[3];
		Arrays.sort(array);

		/*for(int i=0;i<4;i++) {
			t[i]=s.substring(i,i+1);
			System.out.println(t[i]);
		}*/

		/*if(count>2||count1>=2) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}*/

		System.out.println(Math.min(m*n,k));
	}
}


