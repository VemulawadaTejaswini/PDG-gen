import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int heigt  = scan.nextInt();
		int width = scan.nextInt();
		scan.close();

		int area = heigt * width;
		int circum = 2*(heigt + width);

		System.out.println(area + " " + circum);

	}

}