import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		Integer[] list=new Integer[N];
		Integer[] howmany=new Integer[N];
		List<Integer> big=new ArrayList<>();
		List<Integer> bigNumber=new ArrayList<>();
		for(int i=0;i<N;i++){
			list[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++){
			int count=0;
			while(bigNumber.size()>count){
				if(Math.abs(list[i]-list[bigNumber.get(count)])<=K){
					bigNumber.add(count,i);
					if(big.get(count)==0 && big.get(0)!=0)big.add(count,0);
					else big.add(count,big.get(count)+1);
					break;
				}
				count++;
			}
			if(bigNumber.size()<=count){
				bigNumber.add(i);
				big.add(0);
			}
			
		}
		System.out.println(big.get(0)+1);
    }
	
}