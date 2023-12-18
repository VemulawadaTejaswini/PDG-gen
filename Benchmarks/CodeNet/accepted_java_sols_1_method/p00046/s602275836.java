import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double max = n;
		double min = n;
		while(scan.hasNext()){
			n = scan.nextDouble();
			if(n>max){
				max = n;
			}else if(n<min){
				min = n;
			}
		}
		System.out.println(max-min);
	}
}