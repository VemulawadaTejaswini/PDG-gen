import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		    
		    long N = sc.nextLong();
		    int waru = 0;
		    for(int i = 1; i <= Math.sqrt(N); i++) {
		    	if(N % i == 0) {
		    		waru = i;
		    	}
		    	else {
		    	}
		    }
		    long shou = N / waru;
		    int kotae = 0;
		    
		    while(shou != 0){
		    	shou = shou/10;
		    	kotae++;
		    }
		    System.out.println(kotae);
		    
		    sc.close(); }
		  }
