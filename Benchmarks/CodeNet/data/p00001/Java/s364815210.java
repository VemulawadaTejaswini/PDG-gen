import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//Input Data
		Scanner sc	= new Scanner(System.in);
		int[] h	=	new int[10];
		//
		for(int i=0; i<h.length; i++){
			h[i] = sc.nextInt();
		}
		//1st
		int max1 = h[0];
		for(int i=0; i<h.length; i++){
			if(h[i]>max1){
				max1 = h[i];	
			}
		}
		//2nd
		int max2 = h[0];
		for(int i=0; i<h.length; i++){
			if(h[i]>max2 && h[i]<max1){
				max2 = h[i];
			}
		}
		//3rd
		int max3 = h[0];
		for(int i=0; i<h.length; i++){
			if(h[i]>max3 && h[i]<max2){
				max3 = h[i];
			}
		}
		//output
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
		
	}

}