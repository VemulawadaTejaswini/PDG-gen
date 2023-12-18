import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		if(((N%10000)/1000==(N%1000)/100 && (N%1000)/100==(N%100)/10) || ((N%1000)/100==(N%100)/10 && (N%100)/10==N%1)) {
			System.out.println("Yes");
		}else System.out.println("No");
	}
}
