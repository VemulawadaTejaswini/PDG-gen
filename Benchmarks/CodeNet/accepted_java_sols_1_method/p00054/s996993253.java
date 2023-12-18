//Volume0-0054
import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) {
    	
    	//declare    	
    	int      a,b,n,mod,s;
    	String[] str;
    	
    	//input
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		str = sc.nextLine().split("\\s");
    		a   = Integer.parseInt(str[0]);
    		b   = Integer.parseInt(str[1]);
    		n   = Integer.parseInt(str[2]);
    		
    		//calculate
    		s = 0;
    		mod = a % b;
    		while(n-- > 0){
    			mod *= 10;
    			s   += mod / b;
    			mod %= b;
    		}
    		//output
    		System.out.println(s);
    	}
    }
}