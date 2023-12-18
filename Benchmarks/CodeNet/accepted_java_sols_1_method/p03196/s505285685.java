import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long N=scan.nextLong();
			long P=scan.nextLong();

			if(N==1) {
				System.out.println(P);
				return;
			}else{

				long kouyaku = 0;

				long i=1;
				while(true) {
					long x =(long)Math.pow((double)i, (double)N);
					if(P<x)break;
					long S =P/x;
					long E =P%x;
					if(S!=0&&E==0) {
						kouyaku =i;
					}
					i++;
				}

				System.out.println(kouyaku);



			}

		}


	}


}
