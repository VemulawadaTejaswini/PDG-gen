import java.util.*;
import java.io.*;
public class Main{

 static class Reader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public Reader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
       
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e){ 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt(){ 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong(){ 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble(){ 
            return Double.parseDouble(next()); 
        } 
        
        String nextLine(){ 
            String str = ""; 
            try{ 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 


  
    public static void main(final String [] args)throws IOException{
       Reader sc=new Reader();
       int n=sc.nextInt();
       int [] a=new int[n];
       for(int i=0;i<n;i++)a[i]=sc.nextInt();
       int xor=a[0];
       for(int i=1;i<n;i++)xor=xor^a[i];
       for(int i=0;i<n;i++){
           System.out.print((xor^a[i])+" ");
       }


    }
}


