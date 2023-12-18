import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),q=sc.nextLong(),finished=n,sum=0,arr[]=new long[(int)n];
		String str[]=new String[(int)n];
		
		for(int i=0;i<n;i++){
			str[i]=sc.next();
			arr[i]=sc.nextLong();
		}
		while(finished>0){
			for(int i=0;i<n;i++){
				if(arr[i]>q) {
					arr[i]-=q;
					sum+=q;
				}
				else if(arr[i]==0){
					
				}
				else{
					sum+=arr[i];
					arr[i]=0;
					finished--;
					System.out.println(str[i]+" "+sum);
				}
			}
		}
	}

}

