import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int S = scn.nextInt();
		  
		    int m = S/60;
		    int h = m/60;
		    int s = S%60;
		    m = m%60;    
		  System.out.println(h+":" +m +":" +s);
		
	}

}