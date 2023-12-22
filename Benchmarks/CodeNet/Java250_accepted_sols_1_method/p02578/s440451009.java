import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Long[] Ai = new Long[N];
		Long sum = (long) 0;
		
		for(int i = 0; i<N; i++) {
			Ai[i] = sc.nextLong();
		}
	  
		Long max = (long) 0;

		for(int i = 0; i<N-1; i++) {
			long a1 = Ai[i];
			long a2 = Ai[i+1];
          
          	if(a1>max){
				max=a1;
			}
          
			if(max>a2){
				sum += (max-a2);
              	
			}
		}

		System.out.println(sum);	
		return;
	}

}
