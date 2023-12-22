import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int N [] = new int [n];
		int m = 1; int total = 0;
		for(int i =0; i< n; i++){
		    N[i] = scan.nextInt();
		    if(N[i]==m){
		        m++;
		        total++;
		    }
		} 
		if(total==0){
		    System.out.println(-1);
		}
		else{
		    System.out.println(n-total);
		}
		
	}
}
