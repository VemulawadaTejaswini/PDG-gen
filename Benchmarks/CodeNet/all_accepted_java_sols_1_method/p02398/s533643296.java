import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		Scanner G = new Scanner(System.in);
		String imput = G.nextLine();
		String[] arrayimput = imput.split(" ");
		int a = Integer.parseInt(arrayimput[0]);
		int b= Integer.parseInt(arrayimput[1]);
		int c = Integer.parseInt(arrayimput[2]);
		int i, j=0;
		for( i=1 ; i<=c ; i++){
			if( a<=i & b>=i & c%i==0 ){
				j++;
			}
		}
		System.out.println(j);
	}
}