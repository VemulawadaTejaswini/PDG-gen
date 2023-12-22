import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ym = sc.nextInt();

		int i1 = ym/100;
		int i2 = ym%100;
		if(i1 >= 1 && i1 <= 12){
			if(i2 >= 1 && i2 <=12){
				System.out.println("AMBIGUOUS");
			}else{
				System.out.println("MMYY");
			}
		}else{
			if(i2 >= 1 && i2 <=12){
				System.out.println("YYMM");
			}else{
				System.out.println("NA");
			}
		}
	}
}