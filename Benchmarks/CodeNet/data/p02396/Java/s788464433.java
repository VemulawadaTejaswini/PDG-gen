import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	int inputDate;
    	int x =1;
    	while(true) {
    		inputDate = scn.nextInt();
    		if (inputDate == 0) {
    			break;
    		}
    		System.out.println("Case " +  + x++ + "; " + inputDate);
    	}
   	}
 }
