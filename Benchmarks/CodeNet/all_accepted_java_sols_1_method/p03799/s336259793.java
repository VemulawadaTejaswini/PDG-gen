import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long res = 0;
		if(M-2*N >0){
			res = (M-2*N)/4+N;
		}
		else{
			res = M/2;
		}
		System.out.println(res);
	}
}
