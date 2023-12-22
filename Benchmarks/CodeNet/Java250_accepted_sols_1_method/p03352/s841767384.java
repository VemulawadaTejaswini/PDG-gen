import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int[] num=new int[1001];
		int l=1;
		int ans=0;
		num[0]=1;
		
		for(int i=2;i<32;i++){
			int tmp=i;
			for(int j=2;j<10;j++){
				tmp*=i;
				if(tmp<=1000){
					num[l]=tmp;
					l++;
				}
			}
		}

		Arrays.sort(num);

		if(X<1000){
			for(int k=0;k<num.length;k++){
				if(num[k]!=0 && num[k]<=X && X<num[k+1]){ 
					ans=num[k];
				}
			}
		}else{
			ans=1000;
		}


		System.out.println(ans);
		
	}
}