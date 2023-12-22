import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	int c = scan.nextInt();
      	int rest = a - b;
      	if(c -rest > 0){
        	System.out.print(c - rest);
        }
      	else{
        	System.out.print("0");
        }
    }
}