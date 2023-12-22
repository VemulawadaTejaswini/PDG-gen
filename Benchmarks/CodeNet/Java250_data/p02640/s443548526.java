import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      	System.out.println(y%2 == 1 || y > 4*x || y < 2*x ? "No" : "Yes");
    }
}