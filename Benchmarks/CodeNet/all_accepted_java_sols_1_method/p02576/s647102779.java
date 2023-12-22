import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
    	Scanner sn = new Scanner(System.in);
      	int n = sn.nextInt();
      	int x = sn.nextInt();
      	int t = sn.nextInt();
      	int res = n / x;
      	int mod = n % x;
      	if(mod != 0) {
        	res++;
        }
      	res = res * t; 
        System.out.println(res);
    }
}