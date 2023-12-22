import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String[] kinds = new String[n];
		
		int ans=1;
		
		for(int i=0;i<n;i++){
			kinds[i] = sc.next();
		}
		
		Arrays.sort(kinds);
		
		for(int i=1;i<n;i++){
		  		
		//System.out.print(kinds[i]);
			if(kinds[i].equals(kinds[i-1])==false)ans++;
		}
		
		System.out.print(ans);
	}
}
	


