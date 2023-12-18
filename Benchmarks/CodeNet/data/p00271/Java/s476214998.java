import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a;
		int []kotae = new int [8];
		int[]saikou ={30,39,19,25,22,23,10};
		int []saitei={19,20,18,20,21,10,-10};
		int aa=0;

		for(a=0;a<7;a++){
		 aa=saikou[a];
		kotae[a] = aa-saitei[a];
		System.out.print(saikou[a]+"  ");
		System.out.print(saitei[a]+"                     ");
		System.out.println(kotae[a]);
			
		}
			
				
			}

		}