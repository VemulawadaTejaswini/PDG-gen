import java.util.Scanner;



public class main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		while(true){

			int n=sc.nextInt();

			if(n==0)

				break;

			int cnt=0,flag;

			for(int i=n+1;i<=2*n;i++){

				flag=0;

				for(int j=2;j<i;j++){

					if(i%j==0){

						flag=1;

						break;

					}

				}

				if(flag==0)

					cnt++;

			}
			
			System.out.println(cnt);

		}

	}

}