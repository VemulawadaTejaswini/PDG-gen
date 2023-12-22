import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int H[]=new int[N];
		int z=1,max=0,cou=1;
		H[0]=stdIn.nextInt();
		max=H[0];
		while(z<N){
			H[z]=stdIn.nextInt();
			if(max<=H[z]){
				max=H[z];
				cou++;
			}
			z++;
		}
		System.out.println(cou);
	}
}