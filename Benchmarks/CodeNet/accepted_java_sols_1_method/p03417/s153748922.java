import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	long n = sc.nextLong();
      	long m = sc.nextLong();
      	long res = (n-2)*(m-2);
      	System.out.println(res >= 0 ? res : res*-1);
    }
}