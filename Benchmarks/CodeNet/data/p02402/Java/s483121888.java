import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		int i=0;
		int temp=0;
		int minval=0;
		int maxval=0;
		int sumval=0;

		int n = new Scanner(System.in).nextInt();

		Scanner scan = new Scanner(System.in);
		
		
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