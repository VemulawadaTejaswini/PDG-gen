import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int k = stdIn.nextInt();
		int x = stdIn.nextInt();
		
		for(int i = x-k+1; i < x + k; i++){
			System.out.print(i+" ");
		}
	}

}
