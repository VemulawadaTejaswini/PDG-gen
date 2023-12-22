import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String ards[]){
    	Scanner sc = new Scanner(System.in);
    	long x = sc.nextLong();
      	long a = sc.nextLong();
      	long b = sc.nextLong();
      	if(Math.abs(x-a)<Math.abs(x-b)){
        	System.out.println("A");
        }else{
        	System.out.println("B");
        }
    }
}