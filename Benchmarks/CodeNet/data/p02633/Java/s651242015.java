	public static int classes(int X, int K ,int D){
	    int start = X;
	    int least = K;
	    int end  = D;
	    int ans = 0；
	    for(i = 0;i<start-end;i++)
	    {
	        if(process(start,least,end,start,i)==true)
	           {
	                ans= i;
	                break;   
	           }
	    }
	    return ans;
	}
	
		

	
	
	public static process(int start,int least,int end,int cur,int leap){
	    if(least == 0 && cur == end)
	        return true;
	    else if(least<0)
	        return false;
	    else
	        return process(start,least-1,end,cur+1,leap)||process(start,least-1,end,cur-1,leap);
	   
	}