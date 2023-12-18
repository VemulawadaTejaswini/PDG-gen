import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		for (int b=1;b<=a;b++){
			if (b % 3 !=0 && b % 10 != 3){
				continue;
			}
			System.out.print(b+" ");
		}
		System.out.println();
	}
}