import java.util.*;
public class Main{
	public static void main(String args[]){

		Scanner ob = new Scanner(System.in);
		int L = ob.nextInt();
		int R = ob.nextInt(); 
		int d = ob.nextInt();
		int sum = 0;

		for (int i = L; i <= R; i++) {

			if(i % d == 0){
				++sum;
			}
		}
		System.out.println(sum);
	}
}