import java.util.*;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int i = scan.nextInt();
			i += scan.nextInt();
			int digit = 0;
			while(i > 0){
				i /= 10;
				digit++;
			}
			System.out.println(digit);
		}
	}
}