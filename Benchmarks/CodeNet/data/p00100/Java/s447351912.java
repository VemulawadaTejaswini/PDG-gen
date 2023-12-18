import java.util.Scanner;

class Main{


	public static void main(String[] a){


		Scanner sc = new Scanner(System.in);



	while(sc.hasNext()) {
		int n = sc.nextInt();
		if(n == 0){break;}
		int count = 0;

		for(int i = 0; i < n; i++) {
			int syainNo = sc.nextInt();
			int tanka = sc.nextInt();
			int suryo = sc.nextInt();

			if(1000000 <= tanka * suryo) {
				System.out.println(syainNo);
				count++;
			}
		}
		if(count == 0){System.out.println("NA");}


	}


	}
}