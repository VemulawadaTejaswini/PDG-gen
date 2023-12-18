import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 int i=0;
		 for (;;){
			 
				 int x = input.nextInt();
				 if (x == 0) break;
				 else i++;
			 
			 System.out.println("Case "+ i + ": " + x);
		 } 
	 }
}