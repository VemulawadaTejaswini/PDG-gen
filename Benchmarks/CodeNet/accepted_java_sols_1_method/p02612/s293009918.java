import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	System.out.println((1000 - n % 1000) % 1000 );
    }
}