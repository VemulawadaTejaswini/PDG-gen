import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int i,j,k;


			for(i=3;i<=n;i++){
				if(i%3==0) System.out.print(" "+i);
				else {
					for(j=i;j>0;j/=10){
						if(j%10==3){
							System.out.print(" "+i);
							break;
						}

					}
						
			}
		}

			System.out.print("\n");		
	}
}