import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		for(int i=1;;++i){
			int x;
			x=cin.nextInt();
			if(x==0){
		    	break;
			}
			System.out.print("case "+i+": "+x);	    
		}
	}

}