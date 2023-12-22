import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int z=0;
		if(N/100==9)
			z=100;
		else
			z=900;
		if((N%100)/10==9)
			z+=10;
		else
			z+=90;
		if(((N%100)%10)==9)
			z+=1;
		else
			z+=9;
		System.out.println(z);
	}
}
