import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a;
		int temp;
		a = new int[3];
		Scanner stIn = new Scanner(System.in);

		for(int i=0;i<3;i++)
			a[i]=stIn.nextInt();

		stIn.close();

		for(int i=0;i<2;i++) {
			for(int j=1;j<3;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

	for(int i=0;i<2;i++)
		System.out.print(a[i]+" ");
	System.out.println(a[2]);

	}
}

