import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		         int line []= new int [N];
		         double tos=0.0;

				 for(int i=0;i<N;i++) {
				 line[i]  =sc.nextInt();

				 tos+=(double)1/line[i];

				 }

		System.out.println(1/tos);



	}



}