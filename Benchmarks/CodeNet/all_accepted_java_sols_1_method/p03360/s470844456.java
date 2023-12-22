import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [3];
		int b=0;
		int k=0;
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			if(a[i]>b) {
				b=a[i];
				k=i;
			}
		}
		int K=sc.nextInt();
		for(int i=0;i<K;i++) {
			a[k]=a[k]*2;
		}
		k=0;
		for(int i=0;i<3;i++) {
			k=a[i]+k;
		}
		System.out.println(k);
	}
}