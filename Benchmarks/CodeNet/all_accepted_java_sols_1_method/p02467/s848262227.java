import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int[] a = new int[1000];
	int x = 0;
	int z = 1;
		
	int n = scan.nextInt();
		
	a[0] = n;
	
	int na = n;
	
	for(int i=2; i<=n/2; i++){
		if((n / z) % i == 0){
			a[x] = i;
			x++;
			z *= i;
			i = 1;
		}
	}
		if(x==0){
			x = 1;}
	
		System.out.print(na+":");
	
		for(int i=0; i<x; i++){
			System.out.print(" "+a[i]);
		}
	
		System.out.print("\n");
	}
}
