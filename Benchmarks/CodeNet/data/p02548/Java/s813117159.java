import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static int function(int n){
      	int count = 0;
        for(int c = 1; c < n; c++){
          for(int a = 1; a < n; a++){
            for(int b = 1; b < n; b++){
              if(a*b + c == n){
                count++;
                break;
              }
            }
          }
        }
      return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(reader.readLine());
        System.out.println(function(T));
	    }
	    catch( Exception e){
	        return ;
	    }
	}
}