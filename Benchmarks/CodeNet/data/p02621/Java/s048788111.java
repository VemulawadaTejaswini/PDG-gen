import java.util.*;
public class Solution{
	int pow(int x,int y){
		if(y==0)
			return 1;
		if(y==1)
			return x;
		if(y%2==0)
			return pow(x,y/2)*pow(x,y/2);
		else
			return x*pow(x,y/2)*pow(x,y/2);
	}
	public static void main(String[] args){
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(Math.pow(a,1)+Math.pow(a,2)+Math.pow(a,3));
	}
}