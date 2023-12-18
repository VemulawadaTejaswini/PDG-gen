import java.util.Scanner;
 
public class Main{
	
	
	
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] a = new long[N];
		for(int i=0;i<N;i++){
			a[i] = sc.nextLong();
		}
		
		long ans1 = 0;
		long ans2 = 0;
		long s = 0;
		for(int i=0;i<N;i++){
			
			if(i%2==0){
				if(s+a[i]<=0){
					
					ans1 += 1-(s+a[i]);
	
					s=1;
				}else{
					s=s+a[i];
				}
			}else{
				if(s+a[i]>=0){
					
					ans1 += 1+(s+a[i]);
					s=-1;
				}else{

					s=s+a[i];
	
				}
			}

			
		}
		
		s = 0;
		for(int i=0;i<N;i++){
			
			if(i%2==1){
				if(s+a[i]<=0){
					
					ans2 += 1-(s+a[i]);
					s=1;
				}else{
					s=s+a[i];
				}
			}else{
				if(s+a[i]>=0){
					
					ans2 += 1+(s+a[i]);
					s=-1;
				}else{
					s=s+a[i];
				}
			}
			
		}

		System.out.println(Math.min(ans1, ans2));
	}
}

