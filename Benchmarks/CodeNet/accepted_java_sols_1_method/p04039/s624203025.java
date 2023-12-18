import java.util.HashMap;
import java.util.Scanner;




public class Main {
    //static int a=new int[100005];
    static int [] vis=new int[105];
   // static Long [] dp=new Long[505];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        int n=in.nextInt();
        int x;
        for(int i=0;i<=9;i++)
        	vis[i]=0;
        for(int i=1;i<=n;i++)
        {
        	x=in.nextInt();
        	vis[x]++;
        }
        int min=1;
        for(int j=1;j<=9;j++)
		{
			if(vis[j]==0)
			{
				min=j;
				break;
			}
		}
        String ans="";
        int flag=0;
        int fflag=0;
        for(int i=0;i<s.length();i++)
        {
        	if(flag==0)
        	{
        		x=Integer.parseInt(s.charAt(i)+"");
        		if(vis[x]==0) 
        		{
        			ans+=s.charAt(i);
        			continue;
        		}
        		int flag1=0;
        		for(int j=x+1;j<=9;j++)
        		{
        			if(vis[j]==0)
        			{
        				ans+=String.valueOf(j);
        				flag1=1;
        				break;
        			}
        		}
                if(flag1==0)
                {
                	
                		//System.out.println("ss:"+ans);
                		while(true)
                		{
                			if(ans=="")
                        	{
                        		ans+=String.valueOf(min);
                        		fflag=1;
                        		break;
                        	}
                			
                			int temp=Integer.parseInt(ans);
                			int weizhi=temp%10;
                			if(temp/10==0)
                				ans="";
                			else
                    		ans=String.valueOf(temp/10);
               
                    		int flag2=0;
                    		for(int j=weizhi+1;j<=9;j++)
                    		{
                    			if(vis[j]==0)
                    			{
                    				ans+=String.valueOf(j);
                    				flag2=1;
                    				break;
                    			}
                    		}
                    		if(flag2==1) 
                    		{
                    	     break;
                    		}
                		}
                }
        		break;
        	}
        	
        	
        }
        int min1=0;
        for(int j=0;j<=9;j++)
		{
			if(vis[j]==0)
			{
				min1=j;
				break;
			}
		}
        int pos=ans.length();
        if(fflag==0)
        {
        	
        	for(int i=pos;i<s.length();i++)
        		ans+=String.valueOf(min1);
        }
        else
        {
        	for(int i=pos;i<=s.length();i++)
        		ans+=String.valueOf(min1);
        }
        	
      
        System.out.println(Integer.parseInt(ans));
         
         System.gc();
     }
 }
