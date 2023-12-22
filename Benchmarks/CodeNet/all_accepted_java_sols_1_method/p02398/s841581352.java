import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         int a,b,c;
         int count = 0;
         a = scan.nextInt();
         b = scan.nextInt();
         c  = scan.nextInt();

	     for(int x = a;x <= b;x++){
	    	 if(c%x == 0){
	    		 count++;
	    	 }
	     }

	     System.out.println(count);

	}

}