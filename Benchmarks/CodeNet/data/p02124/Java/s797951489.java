import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int x=sc.nextInt();
			x/=100;
			String str="ai1333";
			for(int i=0; i<x; i++) {
				str+="3";
			}
			System.out.println(str);

			
		}
	}
} 
