
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = 100000;
		
		for(int i=0;i<n;i++){
			m = (int)(m * 1.05);
			if(m%1000!=0){
				m = (m/1000)*1000+1000;
			}
		}
		
		System.out.println(m);
	}
}