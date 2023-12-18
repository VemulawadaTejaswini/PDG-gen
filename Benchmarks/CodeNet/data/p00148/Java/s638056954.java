import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int candy = scan.nextInt() % 39;
			if(candy == 0){
				candy = 39;
			}
			System.out.printf("3C%02d\n",candy);
		}
	}
}