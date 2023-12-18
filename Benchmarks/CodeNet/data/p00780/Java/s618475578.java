import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner sc=new Scanner(System.in);
    static final int upperlimit=(int) Math.pow(2, 15);
	
	
	private void cal(){
		ArrayList<Integer> primes=new ArrayList<Integer>();
		
		primes.add(2);
		
		for(int i=3;i<upperlimit;i+=2){
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
		
		for(int j=0;;j++){
			int first=primes.get(j);
			
			if(first>n/2)
				break;
			
			for(int i=j;;i++){
				int second=primes.get(i);
				if(n==first+second)
					count++;
						if(first+second>n)
							break;
			}
		}
		
		
		System.out.println(count);
		
		}
		
	}
	
	public static void main(String[] argv){
		new Main().cal();
	}
	
	
	
}