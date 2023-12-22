import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();	
		int B = sc.nextInt();
		int AB = sc.nextInt();
		long Amax = sc.nextInt();
		long Bmax = sc.nextInt();
		
		long ans = 0;
		
		ans = A*Amax + B*Bmax;
		
		if(ans>Amax*AB*2+Math.max(Bmax-Amax, 0)*B)
			ans = Amax*AB*2+Math.max(Bmax-Amax, 0)*B;
		
		if(ans>Bmax*AB*2+Math.max(Amax-Bmax, 0)*A)
			ans = Bmax*AB*2+Math.max(Amax-Bmax, 0)*A;
		
		System.out.println(ans);

	}

}
