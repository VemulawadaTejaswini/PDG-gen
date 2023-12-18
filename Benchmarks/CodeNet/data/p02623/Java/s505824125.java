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
		  //  long t=Long.parseLong(br.readLine());
	    	 ArrayList<Integer> li=pra.getlistint(br);
			   ArrayList<Integer> li2=pra.getlistint(br);
			   ArrayList<Integer> li3=pra.getlistint(br);
			   
			   int rr1=0;
			   int rr2=0;
			   for(int i=0;i<li.get(0);i++)
			   {
				   if(rr1<=li.get(2))
				   {
					   rr1+=li2.get(i);
					   rr2++;
				   }
			   }
			   int ll1=0;
			   int ll2=0;
			   for(int i=0;i<li.get(1);i++)
			   {
				   if(ll1<=li.get(2))
				   {
					   ll1+=li2.get(i);
					   ll2++;
				   }
			   }
			 
			   int res1=0;
			   int r1=0;
			   while(li2.size()!=0||li3.size()!=0)
			   {
				   if(li2.size()!=0&&li3.size()!=0)
				   {
					   if(li2.get(0)<li3.get(0))
					   {
						   if(res1<=li.get(2))
						   {
							   res1+=li2.get(0);
							   r1++;
						   }
						   li2.remove(0);
					   }else
					   {
						   if(res1<=li.get(2))
						   {
							   res1+=li3.get(0);
							   r1++;
						   }
						   li3.remove(0);
					   }
					   continue;
				   }
				   break;
			/*	   if(li2.size()!=0)
				   {
					   if(res1<=li.get(2))
					   {
						   res1+=li2.get(0);
						   r1++;
						   
					   }
					   li2.remove(0);
				   }
				   if(li3.size()!=0)
				   {
					   if(res1<=li.get(2))
					   {
						   res1+=li3.get(0);
						   r1++;
						 
					   }
					   li3.remove(0);
				   }*/
			   }
			   r1=Math.min(r1, rr1);
			   r1=Math.min(r1, ll1);
			   System.out.println(r1);
		//   System.out.println(res);
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
	   
	    	
	    	
	    	

