import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int r = sc.nextInt();
			int c = sc.nextInt();
			int []a = new int[1000*r+c+1];
			for(int b=0;b<r;++b){
				for(int d=0;d<c;++d){
					a[1000*b+d] = sc.nextInt();
					System.out.print(a[1000*b+d]+" ");
					a[1000*b+c]=a[1000*b+c]+a[1000*b+d];
					a[1000*r+d]=a[1000*r+d]+a[1000*b+d];
				}
				System.out.println(a[1000*b+c]);
			}
			for(int d=0;d<c;++d){
				System.out.print(a[1000*r+d]+" ");
				a[1000*r+c]=a[1000*r+c]+a[1000*r+d];
			}
			System.out.println(a[1000*r+c]);
	}

}