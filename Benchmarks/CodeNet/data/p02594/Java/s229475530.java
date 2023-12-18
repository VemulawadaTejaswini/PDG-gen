import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	if((int)Math.abs(n)>=25){
          System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}
