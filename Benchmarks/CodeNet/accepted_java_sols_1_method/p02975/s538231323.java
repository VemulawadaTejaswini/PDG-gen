								//package Dynamic;
import java.io.*;
import java.util.*;
class Main{
    static public void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       int ar[]=new int[n];
       StringTokenizer st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)
        {
        	ar[x]=Integer.parseInt(st.nextToken());
        }
        int xor=0;
        for(int x=0;x<n;x++)
        {
        	xor=(xor^ar[x]);
        }
        if(xor==0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        //
       
//        int a=Integer.parseInt(st.nextToken());
//        int b=Integer.parseInt(st.nextToken());
//        int c=Integer.parseInt(st.nextToken());
//        int d=Integer.parseInt(st.nextToken());
//        System.out.println(); 
        //}
    }
}
