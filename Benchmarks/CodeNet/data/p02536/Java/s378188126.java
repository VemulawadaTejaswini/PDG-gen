import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Integer[] listA=new Integer[M];
		Integer[] listB=new Integer[M];
		List<List<Integer>> pool=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		Integer[] help=new Integer[N];
		for(int i=0;i<N;i++){
			help[i]=-1;
		}
		for(int i=0;i<M;i++){
			listA[i]=sc.nextInt();
			listB[i]=sc.nextInt();
			set.add(listA[i]);
			set.add(listB[i]);
			if(pool.size()==0){
				List<Integer> hogehoge=new ArrayList<>();
					hogehoge.add(listA[i]);
					hogehoge.add(listB[i]);
					help[listA[i]-1]=0;
					help[listB[i]-1]=0;
					pool.add(hogehoge);
			}else{
				if(help[listA[i]-1]!=-1){
					help[listB[i]-1]=help[listA[i]-1];
				}else if(help[listB[i]-1]!=-1){
					help[listA[i]-1]=help[listB[i]-1];
				}else{
					List<Integer> hogehoge=new ArrayList<>();
					hogehoge.add(listA[i]);
					hogehoge.add(listB[i]);
					help[listA[i]-1]=0;
					help[listB[i]-1]=0;
					pool.add(hogehoge);
				}
			}
			
		}
		System.out.println(pool.size()+N-set.size()-1);
		
		
    }
	
}