import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		long i=0;
		long temp=0;
		long minval=0;
		long maxval=0;
		long sumval=0;

		//long n = new Scanner(System.in).nextInt();

		Scanner scan = new Scanner(System.in);
		long n = Integer.parseInt(scan.next());
		
		for(i=0;i<n;i++){
			temp=Integer.parseInt(scan.next());
			
			if(i==0){
				minval=temp;
				maxval=temp;
				sumval=temp;
			}else{
			
				if(temp<minval){
					minval=temp;
				}
				
				if(maxval<temp){
					maxval=temp;
				}
				
				sumval+=temp;
			}
		}
		
		System.out.println(minval+" "+maxval+" "+sumval);
		
	}
}