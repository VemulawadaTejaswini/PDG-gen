import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			if(a < 35.5 && b < 71.0){
				System.out.println("AAA");
			}else if(a < 37.5 && b < 77.0){
				System.out.println("AA");
			}else if(a < 40.0 && b < 83.0){
				System.out.println("A");
			}else if(a < 43.0 && b < 89.0){
				System.out.println("B");
			}else if(a < 50.0 && b < 105.0){
				System.out.println("C");
			}else if(a < 55.0 && b < 116.0){
				System.out.println("D");
			}else if(a < 70.0 && b < 148.0){
				System.out.println("E");
			}else{
				System.out.println("NA");
			}
		}
	}
}