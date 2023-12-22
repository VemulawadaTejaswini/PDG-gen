import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		
		int N=sc.nextInt();
		int D=sc.nextInt();
		
		int[] kns=new int[N];
		for(int i=0;i<N;i++){
			kns[i]=0;
		}
		int j=0;
		int sum=0;
		while(sum<N){
			sum+=1+2*D;
			j++;
		}
		System.out.println(j);
	}

}	
