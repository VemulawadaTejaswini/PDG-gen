import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int P[]=new int[N];
		int z=0,y=0,m1=0,m2=0,m3=0;
		while(z<N){
			P[z]=stdIn.nextInt();
			if(P[z]<=A)
				m1++;
			if(P[z]>A&&P[z]<=B)
				m2++;
			if(P[z]>B)
				m3++;
			z++;
		}
		if(m1<=m2&&m1<=m3)
			System.out.println(m1);
		else
			if(m2<=m1&&m2<=m3)
				System.out.println(m2);
			else
				if(m3<=m1&&m3<=m2)
					System.out.println(m3);
	}
}
