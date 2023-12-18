 import java.util.Scanner; 
 
 
 public class Main { 
 	public static void main(String[] args) { 
 		Scanner scn = new Scanner(System.in); 
 	int n = scn.nextInt(); 
		int debt = 100; 
 		for (int i = 0; i < n; i++) { 
 			debt = (int)Math.ceil(debt * 1.05); 
		} 
		System.out.println(debt * 1000); 
 	} 
} 