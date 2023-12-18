import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		int []kotae = new int [8];
		int saikou =sc.nextInt();
		int saitei=sc.nextInt();
		int aa=0;

		for(a=0;a<7;a++){
		
		kotae[a] = saikou-saitei;
		System.out.print(saikou);
		System.out.print(saitei);
		System.out.println(kotae[a]);
			
		}
			
				
	       	}

		}