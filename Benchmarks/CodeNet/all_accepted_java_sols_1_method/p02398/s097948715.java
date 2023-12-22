import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);
		//ArrayList<Integer[]> list = new ArrayList<Integer[]>();

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int intCount = 0;

		if(a < b){

			for(int i = a; i <= b; i++){

				if(c % i == 0){
					intCount++;
				}
				//System.out.println("i: " + i);
			}
			//System.out.println("intCount: " + intCount);
			System.out.println(intCount);
		}else{

			for(int i = b; i <= a; i++){

				if(c % i == 0){
					intCount++;
				}
				//System.out.println("i: " + i);
			}
			//System.out.println("intCount: " + intCount);
			System.out.println(intCount);
		}

	}
}