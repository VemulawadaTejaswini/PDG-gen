import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int z=0,y=0,x=0,x2=0;
		while(z<N){
			y=stdIn.nextInt();
			if(y%2==0)
				x++;
			else
				x2++;
			z++;
		}
		if(x2==0||x==0)
			System.out.println("YES");
		else
			if(x2%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
	}
}