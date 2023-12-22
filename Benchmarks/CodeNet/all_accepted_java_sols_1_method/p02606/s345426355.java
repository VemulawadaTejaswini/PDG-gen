import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int l = in.nextInt();
      	int r = in.nextInt();
      	int d = in.nextInt();
      
      	System.out.println(r/d - (l-1)/d);
    }
}