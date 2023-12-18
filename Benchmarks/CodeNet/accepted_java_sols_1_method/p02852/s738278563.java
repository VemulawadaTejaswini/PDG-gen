
import java.util.*;

public class Main{
	public static void main(String[] args){
		
		//long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		String str=sc.next();
		char[] c=str.toCharArray();
		//char[] c=new char[n+1];
		
		
		/*for(int i=0;i<tmparray.length;i++){
			c[i]=tmparray[n-i];
		}*/
		
		
		int c1=0;
		
		StringBuilder ans=new StringBuilder();
		
		
		//Case unsolvable
		for(char ch:c){
			if(ch=='1'){
				c1++;
				if(c1>=m){
					System.out.println("-1");
					System.exit(0);
					
				}
			}else{
				c1=0;
			}
		}

		
		
		//case solvable
		
		
		int index=0;
		for(int i=m;i>0;i--){
			if((index+i)==c.length-1){
				ans.insert(0," ");
				ans.insert(0,i);
				break;
			}else if((index+i)>=c.length){
				continue;
			}
			if(c[n-index-i]=='1'){
				continue;
			}else{
				if(ans==null)ans.append(i);
				else{
					ans.insert(0," ");
					ans.insert(0,i);
				}
				index=index+i;
				i=m+1;
			}
		}
		
		System.out.println(ans);
		//long endTime = System.currentTimeMillis();
		//System.out.println("処理時間：" + (endTime - startTime) + " ms");
		}
		
	
}

