import java.util.*;
public class Main {
	public static void main(String[] args){
    	int x=0;
        int y;
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
      		for(int i= 0; i < a.length(); i++){
      			if(a.charAt(i)=='o'){
        			x=x+1;
      			}
    		}
        y = 700 + 100*x;
    System.out.println(y);
    }
}