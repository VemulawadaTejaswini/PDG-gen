import java.util.*;
public class Main {
    private static final int N = 1000000;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int [] prime = new int [N];
		for(int i=2;i*i<N;i++){
			if(prime[i]==1)
				continue;
			for(int j=i*2;j<N;j=j+i){
				prime[j]=1;
			}
		}
		for(int i=2;i<N;i++){
			prime[i]=prime[i-1]+(prime[i]==0?1:0);
		}
		  while ( sc.hasNextInt ( ) )
		    {
		      int n;
		      
		      n = sc.nextInt ( );
		      System.out.println ( prime[ n ] );
		    }
	return;	    
	}

}