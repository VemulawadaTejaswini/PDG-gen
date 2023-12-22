import java.util.Scanner;

class Main{
	static public void main (String args[]){
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\s");
		int val1 = 0;
		int val2 = 0;
		int area = 0;
		int around = 0;
		
		val1 = scan.nextInt();
		val2 = scan.nextInt();

		area = val1*val2;
		around = (val1 + val2)*2;
		System.out.println(area+" "+around);
	}
}