import java.util.*;
import java.io.*;
 class Main
{
    static int dp[][];
    
    static int min(int pos , int lastcol , LinkedList<slab> arr)
    {
        if(pos == arr.size())
        return 0;
        
        if(dp[pos][lastcol] != -1)
        return dp[pos][lastcol];
        
        int mn = Integer.MAX_VALUE;
        
        if(lastcol == 0 && arr.get(pos).col == 1)
        {
            mn = arr.get(pos).tot + min(pos+1 , 1 , arr);
        }
        
        else if(lastcol == 1 && arr.get(pos).col == 0)
        {
            mn = Math.min(min(pos+1 , 0 , arr) , arr.get(pos).tot + min(pos+1 , 1 , arr));
        }
        
        else
        {
            mn = min(pos+1 , arr.get(pos).col , arr);
        }
        dp[pos][lastcol] = mn;
        return mn;
    }
  public static void main(String []args) throws IOException
  {
   BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
  
        StringTokenizer st = new StringTokenizer(br.readLine()); 
   int n = Integer.parseInt(st.nextToken());
   st = new StringTokenizer(br.readLine());
   
   String s = st.nextToken();
   int i = 0 ;
   LinkedList<slab> list = new LinkedList<slab>();
   while(i < s.length())
   {
       int j = i;
       while(j+1 < s.length() && s.charAt(j) == s.charAt(j+1))
       {
           j++;
       }
       int col = -1;
       if(s.charAt(i) == 'W')
       col = 0;
       
       else
       col = 1;
       list.add(new slab(col , j-i+1));
       i = j+1;
   }
   dp = new int[s.length()][2];
   for(int j = 0 ; j < s.length() ; j++)
   {
       dp[j][0] = -1;
       dp[j][1] =  -1;
   }
   
   System.out.println(min(0 , 1 , list));
   
  }
}

class slab
{
    int col , tot;
    public slab(int col , int tot)
    {
        this.col = col;
        this.tot = tot;
    }
}