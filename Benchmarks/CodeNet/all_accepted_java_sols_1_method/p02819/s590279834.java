
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		if(n==2) {
			System.out.println(2);
		}else {
			if(n%2==0) {
				n++;
			}
			int f=0;
			do {
					f=0;
					for(int i=3;i<n/3;i+=2) {
						if(n%i==0) {
							f=1;
							n+=2;
							break;

						}
					}

			}while(f==1);
			System.out.println(n);
		}




	}

}
