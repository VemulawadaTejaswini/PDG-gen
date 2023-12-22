import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		int max=0;
		int a[] =new int[N];
		int b[]=new int[N-1];
		for(int i=0;i<N-1;i++) {
			b[i]=sc.nextInt();
			if(i==0) {
				a[i]=b[i];
			}else {
				if(b[i]<b[i-1]) {
					a[i]=b[i];
				}else {
					a[i]=b[i-1];
				}
			}
			sum+=a[i];
		}
		sum+=b[N-2];
		System.out.println(sum);

	}

}
