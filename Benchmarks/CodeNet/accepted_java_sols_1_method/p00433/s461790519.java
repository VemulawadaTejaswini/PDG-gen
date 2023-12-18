//Volume5-0510
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int ret=0;
		int S = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		int T = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		if   (S<T){ret = T;}
		else      {ret = S;}
		System.out.println(ret);
	}
}