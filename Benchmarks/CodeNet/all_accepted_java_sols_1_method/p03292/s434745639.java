import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a[]=new int[3];
		int z=0;
		while(z<3){
			a[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(a);
		System.out.println((a[1]-a[0])+(a[2]-a[1]));
	}
}
