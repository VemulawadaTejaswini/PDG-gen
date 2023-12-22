
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), det = 100000;
		int rishi;
		for(int i = 0; i < n; i++){
			rishi = (det/100) * 5;
			if(rishi%1000 == 0){
				rishi /= 1000;
			} else {
				rishi = (rishi/1000) +1;
			}
			rishi *= 1000;
			det += rishi;
		}
		System.out.println(det);	
	}
}