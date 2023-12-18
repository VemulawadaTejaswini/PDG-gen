import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int day = sc.nextInt();
		int rest = sc.nextInt();
		
		int sum = 0;
		
		int st[] = new int[a];
		
		for(int i=0;i<a;i++){
			st[i] = sc.nextInt();
		}
		
		for(int i=0;i<a;i++){
			sum += ((day-1) / st[i] ) + 1;
		}
		sum += rest;
		System.out.println(sum);
	}
}