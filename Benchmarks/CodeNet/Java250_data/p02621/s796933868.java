/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
		
	  int 	getint(BufferedReader sc) throws java.lang.Exception
		{
	//	  String ss=sc.readLine();
	    	int a= Integer.parseInt(sc.readLine());
	    	return a;
		}
	  ArrayList<Integer> getlistint(BufferedReader sc) throws java.lang.Exception
	  {
		  ArrayList<Integer> res=new ArrayList<>();
		  
		  String s=sc.readLine();
		  String[] ss=s.split(" ");
		
		  for(int i=0;i<ss.length;i++)
		  {
			//  String ss=sc.readLine();
		    	int a=Integer.valueOf(ss[i]);
		    	res.add(a);
		  }
	  
		  return res;
	  }
	  ArrayList<Float> getlistfl(BufferedReader sc) throws java.lang.Exception
	  {
		  ArrayList<Float> res=new ArrayList<>();
		  
		  String s=sc.readLine();
		  String[] ss=s.split(" ");
		
		  for(int i=0;i<ss.length;i++)
		  {
			//  String ss=sc.readLine();
		    	float a=Float.valueOf(ss[i]);
		    	res.add(a);
		  }
	  
		  return res;
	  }
	  ArrayList<Long> getlist(BufferedReader sc) throws java.lang.Exception
	  {
		  ArrayList<Long> res=new ArrayList<>();
		  
		  String s=sc.readLine();
		  String[] ss=s.split(" ");
		
		  for(int i=0;i<ss.length;i++)
		  {
			//  String ss=sc.readLine();
		    	long a=Integer.valueOf(ss[i]);
		    	res.add(a);
		  }
	  
		  return res;
	  }
	  ArrayList<Character> getlistchar(BufferedReader sc) throws java.lang.Exception
	  {
		  ArrayList<Character> res=new ArrayList<>();
		  
		  String s=sc.readLine();
		//  String[] ss=s.split(" ");
		
		  for(int i=0;i<s.length();i++)
		  {
			//  String ss=sc.readLine();
		    	//char[] a=ss[i].toCharArray();
		    	res.add(s.charAt(i));
		  }
	  
		  return res;
	  }

	  static int n;
	  static int b[];
	  static StringBuffer ans = new StringBuffer("");
	  static BufferedReader bf;
	  static class Pair{
	      char val;int cnt;
	      Pair(char val,int cnt)
	      {
	          this.val=val;
	          this.cnt=cnt;
	      }
	  }

	 
	    public static void main(String[] args) throws Exception 
	    {
	    	Main pra=new Main();
	    	//Scanner sc = new Scanner(System.in);
	      //  int tc;
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    //	Scanner in=new Scanner(System.in);
		    long t=Long.parseLong(br.readLine());
		    
		    long res=t+(t*t)+(t*t*t);
		    System.out.println(res);
		//  long max=Long.MAX_VALUE;
		/*   while(t-->0){
		    	//int num=Integer.parseInt(br.readLine());
		   ArrayList<Character> li=pra.getlistchar(br);
		   ArrayList<Character> li2=pra.getlistchar(br);
		 int res=0;
		   for(int i=0;i<li2.size();i++)
		   {
			   if(li.contains(li2.get(i)))
				   res++;
		   }
		   
		   System.out.println(res);
		  
	       }*/
		  // 
	     
	        
	        }
	    }
	   
	    	
	    	
	    	

