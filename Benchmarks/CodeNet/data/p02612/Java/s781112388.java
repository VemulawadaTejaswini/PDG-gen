/**
 * 
 */


/**
 * @author Jnaneswar Reddy
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		while(n>=1000)
		{
			n=n%1000;
		}
		if(n>0)
		System.out.println(1000-n);
		else
			System.out.println(n);
	}

}
