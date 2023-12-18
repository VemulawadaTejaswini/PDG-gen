import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
      	long B = sc.nextLong();
      	long K = sc.nextLong();
      	for(long i=A;i<=B;i++){
        	if(i<A+K||i>B-K){
            	System.out.println(i);
            }
        }
 		sc.close();
	}
}
