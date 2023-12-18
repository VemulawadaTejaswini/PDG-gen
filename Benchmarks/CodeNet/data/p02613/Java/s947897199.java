    import java.util.*;
    import java.util.Scanner;
    import java.io.*;
    import java.io.BufferedReader; 
    import java.io.IOException; 
    import java.io.InputStreamReader; 
    import java.util.Scanner; 
    import java.util.StringTokenizer; 
    
    public class Main
    {
        static class FastReader 
        { 
            BufferedReader br; 
            StringTokenizer st; 
    
            public FastReader() 
            { 
                br = new BufferedReader(new
                        InputStreamReader(System.in)); 
            } 
    
            String next() 
            { 
                while (st == null || !st.hasMoreElements()) 
                { 
                    try
                    { 
                        st = new StringTokenizer(br.readLine()); 
                    } 
                    catch (IOException  e) 
                    { 
                        e.printStackTrace(); 
                    } 
                } 
                return st.nextToken(); 
            } 
    
            int nextInt() 
            { 
                return Integer.parseInt(next()); 
            } 
    
            long nextLong() 
            { 
                return Long.parseLong(next()); 
            } 
    
            double nextDouble() 
            { 
                return Double.parseDouble(next()); 
            } 
    
            String nextLine() 
            { 
                String str = ""; 
                try
                { 
                    str = br.readLine(); 
                } 
                catch (IOException e) 
                { 
                    e.printStackTrace(); 
                } 
                return str; 
            } 
        } 
        
        

        public static void main(String args[]) 
        {  
            FastReader in=new FastReader();
            int n=in.nextInt();
            String AC="AC";
            String WA="WA";
            String TLE="TLE";
            String RE="RE";
            int counta=0;
            int countw=0;
            int countl=0;
            int countr=0;
            while(n-->0)
            {
                String S=in.nextLine();
                if(S.equals(AC))
                    counta++;
                else if(S.equals(WA))
                    countw++;
                else if(S.equals(TLE))
                    countl++;
                else if(S.equals(RE))
                    countr++;
                
            }
            System.out.println("AC x "+counta);
            System.out.println("WA x "+countw);
            System.out.println("TLE x "+countl);
            System.out.println("RE x "+countr);
    
            
                
            
        }
    }