
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int A=in.nextInt(),D=in.nextInt(),N=in.nextInt();
			if(A==0 && D==0)break;
			
			boolean ENE[]=new boolean[A+(D*N)*25+1];
			Arrays.fill(ENE,true); ENE[1]=false;
			
			for(int i=2;i<Math.sqrt(ENE.length);i++) {
				if(ENE[i]) {
					for(int j=i*2;j<ENE.length;j+=i)ENE[j]=false;
				}
			}
			
			List<Integer> primes=new ArrayList<>();
			for(int i=A;i<ENE.length;i++) {
				if(ENE[i] && (i-A)%D==0 )primes.add(i);
			}
			
			System.out.println(primes.get(N-1));
		}
	}

}

