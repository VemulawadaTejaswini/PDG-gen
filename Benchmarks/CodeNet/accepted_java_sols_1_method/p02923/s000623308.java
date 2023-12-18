import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		int count=0;
		int max=0;

		for(int i=1;i<n;i++){
			if(h[i]<=h[i-1]){
				count++;
			}else{
				if(max<count){
					max=count;
				}
				count=0;
			}
		}
		if(max<count){
			max=count;
		}
		System.out.println(max);

	}
}
