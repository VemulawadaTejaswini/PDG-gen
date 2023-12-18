import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		
		int N =sc.nextInt();
		int[] ar =new int[N];
		int[] br =new int[N];
		
		for(int i=0;i<N;i++){
			ar[i] = sc.nextInt();
			br[i] = sc.nextInt();			
		}
		int min=0;
		
		int m1=br[0];
		for(int i=1;i<N;i++){
			m1 = Math.min(m1,br[i]);
		}
		
		int count=0;
		
		for(int i=1;i<N;i++){
			if(m1==br[i]) count=i;
		}
		int result=ar[count]+br[count];
				
		System.out.println(result);

		
		
	}

}
