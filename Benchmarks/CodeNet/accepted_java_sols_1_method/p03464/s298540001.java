import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long a[]= new long[k];
		for(int i=0;i<k;i++) {
			a[i] = sc.nextInt();
		}
		boolean hantei =true;
		long max[] =new long[k+1];
		long min[] =new long[k+1];
		max[k]=2;
		min[k]=2;
		for(int i=k-1;i>=0;i--) {
			max[i]=max[i+1]+a[i]-1;
			if(i>0)
				max[i]=(max[i]/a[i-1])*a[i-1];
			min[i]=((min[i+1]-1)/a[i]+1)*a[i];
			if(min[i]-(min[i]%a[i])<min[i+1]||min[i]-(min[i]%a[i])>max[i+1]) {
				System.out.print(-1);
				hantei=false;
				break;
			}
		}
		if(hantei) {
			System.out.println(min[0]);
			System.out.print(max[0]);
		}
	}

}
