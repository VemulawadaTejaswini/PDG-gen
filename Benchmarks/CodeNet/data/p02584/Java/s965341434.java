public static void main (String[] args) throws java.lang.Exception
	{
	   return progress(args[0],args[1],args[2]);
	}
	
	public static int progress(int X, int K ,int D){
	    int start = X;
	    int least = K;
	    int end  = D;
	    int answer = 0;
	    for(int i = 0;i<=start-end;i++)
	    {
	        if(process(start,least,end,start,i)==true)
	           {
	                answer  = i;
	                break;   
	           }
	    }
	    return answer;
	}
	
	
	
	
	
	public static Boolean process(int start,int least,int end,int cur,int leap){
	    if(least == 0 && cur == end)
	        return true;
	    else if(least<0)
	        return false;
	    else
	        return process(start,least-1,end,cur+leap,leap)||process(start,least-1,end,cur-leap,leap);
	}