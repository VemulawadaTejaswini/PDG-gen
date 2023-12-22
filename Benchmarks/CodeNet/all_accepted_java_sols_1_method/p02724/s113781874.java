import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	Long x = sc.nextLong();
      	long a = x / 500;
      	long b = (x%500)/5;
      	System.out.println(a*1000 + b*5);
    }
}