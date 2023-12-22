import java.util.*;
public class Main{
      	public static void main(String[] a)throws java.io.IOException{
    		Scanner scan=new Scanner(System.in);
    		while(true){
    			int n= scan.nextInt();
    			if(n==0)break;
    			int [] s = new int[n];
    			int [] c = new int[n];
    			int max=0;
    			for(int i=0;i<n;i++){
    				s[i]=scan.nextInt();
    				max=Math.max(s[i], max);
    			}
    			int count=0;
    			while(!Arrays.equals(s, c)){
    				int [] f = new int[max+1];
    				max=0;
    				for(int i=0;i<n;i++){
    					f[s[i]]++;
    					c[i]=s[i];
    				}
    				for(int i=0;i<n;i++){
    					s[i]=f[s[i]];
    					max=Math.max(s[i], max);
    				}
    				count++;
    			}
    			StringBuilder ans = new StringBuilder();
    			for(int i=0;i<n;i++){
    				ans.append(c[i]);
    				if(i!=n-1)ans.append(" ");
    			}
    			System.out.println(count-1);
    			System.out.println(ans.toString());
    		}
    	}
}