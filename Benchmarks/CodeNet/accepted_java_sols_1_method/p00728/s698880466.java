import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true){
			int n =sc.nextInt();
			if(n==0){break;}
			int[] s =new int[n];
			
			for(int i=0; i<n;i++){
				s[i]=sc.nextInt();
			}
			int low =s[0];
			int high =s[0];
			int sum=s[0];
			
			for(int i=1;i<n;i++){
				sum = sum + s[i];
			
				if(s[i]<low){
					low=s[i];
				}else if(s[i]>high){
					high=s[i];
				}
			}
			
			int ave =(sum-high-low)/(n-2);
			
		System.out.println(ave);
		}
	}
}