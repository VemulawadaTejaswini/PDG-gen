import java.util.*;
class Main  
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   System.out.println(process2());
	}
	
	public static int process2(){
	  
	    Scanner scan = new Scanner(System.in);
	    int start = scan.nextInt();
	    int least = scan.nextInt();
	    int end  = scan.nextInt();
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
	
	
	
	
	
	public static boolean process(int start,int least,int end,int cur,int leap){
	    if(least == 0 && cur == end)
	        return true;
	    else if(least<0)
	        return false;
	    else
	        return process(start,least-1,end,cur+leap,leap)||process(start,least-1,end,cur-leap,leap);
	}
}