import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3000];
		int[] y = new int[3000] ;
		for (int i = 0; i<x.length ; i++) {
			
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(x[i] == 0 & y[i] == 0) break;
		}
		
		for (int i = 0; i<x.length ; i++) {
			if(x[i] == 0 & y[i] == 0) {
				break;
			}else {
			   if(x[i] > y[i]) {
				System.out.println(y[i] + " " + x[i]);
			   }
			   if(x[i] < y[i]) {
				System.out.println(x[i] + " " + y[i]);
			   }
			   if(x[i] == y[i]) {
				System.out.println(x[i] + " " + x[i]);
			   }
		    }
		}
		