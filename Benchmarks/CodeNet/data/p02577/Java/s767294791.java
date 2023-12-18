import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //Scanner sc=new Scanner(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=1;
	   // t=sc.nextInt();
	    //int t=Integer.parseInt(br.readLine());
	    while(--t>=0){
	      //  int n=sc.nextInt();
	         //     int n=Integer.parseInt(br.readLine());
	         //      int k=sc.nextInt();
	              String s=br.readLine();
	              long sum=0;
	           //  int n=s.length();
	         //     StringTokenizer st=new StringTokenizer(br.readLine());
	         //      int n=Integer.parseInt(st.nextToken());
	          for(int i=0;i<s.length();i++){
	               int  ch=s.charAt(i)-'0';
	              sum=sum+(long)ch;
	          }
	        if(sum%9==0)
	        System.out.println("Yes");
	        else
	        System.out.println("No");
	     
	        
	    }
	    
	}
}