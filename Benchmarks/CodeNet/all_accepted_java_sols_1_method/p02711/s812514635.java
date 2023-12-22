import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();        

		if(k%10==7||k/100==7||(k%100)/10==7){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}		
	    scan.close();	
    }
}