import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		int R;
		
		if(N % 2 != 0){
			R = (N / 2) + 1;
		}
		else{
			R = N / 2;
		}

		System.out.println(R);	
	}
}
