import java.util.*;
public class Main {
	
	static List<Integer> U=new ArrayList<>(); 
	static int m;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		for(int i=0;i<n;i++)U.add(Integer.parseInt(in.next()));
		
		int q=in.nextInt();
		for(int i=0;i<q;i++){
			m=in.nextInt();
			System.out.println((solve(0,0))? "yes":"no");
		}
	}
	
	static boolean solve(int sum,int i){
		//System.out.println(sum);
		if(sum==m)return true;
		else if(sum>m)return false;
		
		for(int j=i;j<U.size();j++){
			if(solve(sum+U.get(j),j+1))return true;
		}
		return false;
	}


}
