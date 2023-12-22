import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N/2;

		if(N%2==0){
		System.out.println((double)N/2/N);
		}else {
	 	System.out.println((double)(n+1)/N);      
        }
}
}
