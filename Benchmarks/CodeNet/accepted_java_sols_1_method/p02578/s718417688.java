import java.util.*;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String []args){
		long n=sc.nextInt();
		long curMax=0,temp,totalHeight=0;
		for(int i=0;i<n;i++){
			temp=sc.nextInt();
			if(curMax<temp)
				curMax=temp;
			totalHeight+=(curMax-temp);
		}
		System.out.println(totalHeight);
	}
}