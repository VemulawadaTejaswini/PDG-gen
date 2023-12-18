import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		int k =sc.nextInt();
		long a[] =new long[x];
		long b[] =new long[y];
		long c[] =new long[z];
		for(int i=0;i<x;i++) {
			a[i] = sc.nextLong();
		}
		for(int i=0;i<y;i++) {
			b[i] = sc.nextLong();
		}
		for(int i=0;i<z;i++) {
			c[i] = sc.nextLong();
		}
		long ab[]= new long[1000000];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				ab[i*y+j]=a[i]+b[j];
			}
		}
		
		Arrays.sort(ab);
		long abc[]=new long[3000000];
		for(int i=0;i<3000;i++) {
			for(int j=0;j<z;j++) {
				abc[i*z+j]=ab[999999-i]+c[j];
			}
		}
		Arrays.sort(abc);
		
		for(int i=0;i<k;i++) {
		System.out.println(abc[2999999-i]);
		}
		
	}

}



