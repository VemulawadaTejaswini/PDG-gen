import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int happy = 0;

		happy += (x/500)*1000;
		happy += ((x%500)/5)*5;
		System.out.println(happy);
			
	    scan.close();	
    }
}