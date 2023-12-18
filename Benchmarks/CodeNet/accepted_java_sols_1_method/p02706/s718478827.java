import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//夏休み
		int m=sc.nextInt();//宿題の数
		
		int sum=0;
		
		for(int i=0;i<m;i++){
			sum+=sc.nextInt();
		}
		
		if(sum>n)System.out.println(-1);
		else System.out.println(n-sum);
	}
}