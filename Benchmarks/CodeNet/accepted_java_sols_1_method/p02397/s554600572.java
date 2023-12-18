import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
		  
		  while(scan.hasNextLine()) {
		     int i = scan.nextInt();
			 int j = scan.nextInt();
			 if(i == 0 && j == 0) break;
			 
			 if(i > j) {
				 i = i + j;
				 j = i - j;
				 i = i - j;
			 }
			 
			 System.out.println(i + " " + j);
			 scan.nextLine();
		  }
	   }

}

