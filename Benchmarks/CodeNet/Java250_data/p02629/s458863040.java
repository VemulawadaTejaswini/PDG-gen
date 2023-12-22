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
       long n=sc.nextLong();
       String s="";

       while(n>0){
         n=n-1;
         s=(char)('a'+(n%26))+s;
         n=n/26;
       }
       System.out.println(s);


    }
}


