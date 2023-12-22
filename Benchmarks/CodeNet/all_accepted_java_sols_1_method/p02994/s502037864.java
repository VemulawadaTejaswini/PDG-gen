import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		int ans=0;
		if(0<=L){ans=(2*L+N)*(N-1)/2;}
		if(0>=L+N-1){ans=(2*L+N-2)*(N-1)/2;}
		if(L<= 0 &&  0<=L+N-1){ans=(2*L+N-1)*(N)/2;}
		
		System.out.println(ans);

	
	}
}