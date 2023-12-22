import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c[]=new int[b];
		for(int i=0;i<b;i++) {
			c[i]=sc.nextInt();
		}
		Arrays.sort(c);
		c[b-1]--;
		for(int i=b-2;i>=0;i--) {
			c[b-1]-=c[i];
		}
		System.out.println(c[b-1]<0?"0":c[b-1]);
	}
}