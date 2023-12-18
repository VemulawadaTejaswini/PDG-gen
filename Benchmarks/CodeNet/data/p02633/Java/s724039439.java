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


  static int gcd(int a,int b){
      if(b==0)return a;
      return gcd(b,a%b);
  }
  static int f(int n){
      return (180*(n-2))/n;
  }
    public static void main(final String [] args)throws IOException{
       Reader sc=new Reader();
       int n=sc.nextInt();
       int lcm=(360*n)/gcd(360,n);
       int ans=lcm/n;
       System.out.println(ans);

      

    }
}


