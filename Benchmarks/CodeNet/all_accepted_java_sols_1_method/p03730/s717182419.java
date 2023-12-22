

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    sc.close();
	    
	    boolean check=false;
	    
	    for(int i = 1; i<=B; i++) {
	    	if ((i*A)%B==C){
	    		check=true;
	    		break;
	    	}
	    }
	    
	    if (check==false)
	    	System.out.println("NO");
	    
	    else 
	    	System.out.println("YES");
	}

}
