
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		ArrayList<Integer>[] list=new ArrayList[n];
		for(int i=0;i<n;i++){
			list[i]=new ArrayList();
		}
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			list[a-1].add(b-1);
			list[b-1].add(a-1);
		}
		int[] ans = fs(list, 0,new int[n],m,1);
		
		for(int i=0;i<n;i++){
			if(ans[i]==0){
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
		
		for(int i=1;i<n;i++){
			System.out.println(ans[i]);
		}
	}
	
	public static int[] fs(ArrayList[] list,int c,int[] ans,int m,int count){
		if(list[c]==null)return ans;
		
		ArrayList l = list[c];
		
			for(int j=0;j<l.size();j++){
				int nc=(int) l.get(j);
				if(ans[nc]!=0 && ans[nc]<count)return ans;
				ans[nc]=count;
			}
			/*for(int i=1;i<ans.length;i++){
				System.out.println(ans[i]);
			}*/
			for(int j=0;j<l.size();j++){
				//count++;
				//System.out.println(nc+" "+ans[nc]);
				//System.out.println(count);
				ans=fs(list,(int) l.get(j),ans,m,count+1);
			}
		return ans;
	}

}
