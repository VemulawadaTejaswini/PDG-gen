import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		double x=0;
		String u="";
		int z=0;
		double y=0;
		while(z<N){
			x=stdIn.nextDouble();
			u=stdIn.next();
			if(u.equals("BTC"))
				y+=x*380000;
			else
				y+=x;
			z++;
		}
		System.out.println(y);
	}

}