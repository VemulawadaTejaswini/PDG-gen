import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner sc=new Scanner(System.in);
	static final int upperlimit=(int) Math.pow(2, 15);
	
	
	private void cal(){
		
		boolean[] values=new boolean[1<<15];
		Arrays.fill(values,true);
		values[0]=false;
		values[1]=false;
		
		for(int i=2;i<1<<15;i++)
		    if(values[i])
			for(int j=2;i*j<1<<15;j++)
			    values[i*j]=false;
				
		
		
		while(true){
			int n=sc.nextInt();
			int count=0;
			
			if(n==0)
				break;
			for(int i=0;i<=n/2;i++)
				if(values[i]&&values[n-i])
					count++;
		
		
		System.out.println(count);
		
		}
		
	}
	
	public static void main(String[] argv){
		new Main().cal();
	}
	
	
	
}