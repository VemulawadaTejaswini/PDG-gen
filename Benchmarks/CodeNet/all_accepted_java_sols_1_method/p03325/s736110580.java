import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a+b < 17 && a < 9 && b < 9)
			System.out.println("Yay!");
		else
			System.out.println(":(");
		*/
		//B
		/*
		int d = sc.nextInt();
		int n = sc.nextInt();
		if(n == 100)
			System.out.println((long) Math.pow(100,d)*n+1);
		else
			System.out.println((long)Math.pow(100,d)*n);
			*/
		//C
		int n = sc.nextInt();
		int [] a = new int[n];
		int counter  =0;
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int j  =0 ; j < n ; j++){
			int x  = 0;
			while(true){
				if(a[j] % 2 == 1)
					break;
				else{
					a[j]/=2;
					x++;
				}
			}
			counter += x;
		}
		System.out.println(counter);
		//D

	}
}
