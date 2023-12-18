import java.util.ArrayList;
import java.util.Scanner;


public class Main{

	Scanner sc=new Scanner(System.in);
	static final int upperlimit=2*123456;
	
	private void cal(){
		
		ArrayList<Integer> primes=new ArrayList<Integer>();
		
		primes.add(2);

		for(int i=3;i<Main.upperlimit;i+=2){
			for(int j=0;j<primes.size();j++){
				if(i%primes.get(j)==0)
					break;
				if(j==primes.size()-1)
					primes.add(i);
			}
		}
	
		
		
		while(true){
			int n=sc.nextInt();
			int count=0;
			
			if(n==0)
				break;
			
			for(int i=0;i<primes.size();i++){
				int prime=primes.get(i);
				if(prime>2*n)
					break;
				else if(prime<=n)
					continue;
				else count++;
				
			}
			System.out.println(count);
						
		}
		
		
	}
	
	public static void main(String[] argv){
		new Main().cal();
	}
	
}