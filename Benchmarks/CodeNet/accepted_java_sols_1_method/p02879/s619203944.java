import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      
      	int result = 1 <= a & a < 10 && 1 <= b && b < 10 ? a*b : -1;
      	System.out.println(result);
	}
}