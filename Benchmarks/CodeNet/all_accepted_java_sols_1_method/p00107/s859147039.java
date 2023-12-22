import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int n = sc.nextInt();
		int r[] = new int[10000];
		int c;
		int count=0;
	while(true){
		if(count>0){
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		if(x==0 && y==0 && z==0)
			break;
		n = sc.nextInt();
			}


		for(int i=0;i<n;i++)
			r[i] = sc.nextInt();
		int a;
		int b;
		if(x>y)
			if(x>z){
				a = y;
				b = z;
			}
			else{
				a = x;
				b = y;
			}
		else if(y>z){
			a = x;
			b = z;
		}
		else{
			a = x;
			b = y;
		}
		c = (int) Math.sqrt(a*a+b*b);
		for(int i=0;i<n;i++)
			if(r[i]*2<=c)
				System.out.println("NA");
			else
				System.out.println("OK");
		count++;
	}
	}	
}