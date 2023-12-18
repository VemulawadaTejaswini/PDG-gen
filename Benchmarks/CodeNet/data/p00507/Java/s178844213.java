
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			String str;
			if(n==3) {
				str = String.valueOf(a[1])+String.valueOf(a[0]);
			}
			else {
				String str1 = String.valueOf(a[3])+String.valueOf(a[0]);
				str = String.valueOf(a[0])+String.valueOf(a[2]);
				if(Integer.parseInt(str)>Integer.parseInt(str1))
					str = str1;
				
			}
			System.out.println(str);
			
//		}
	}
}
