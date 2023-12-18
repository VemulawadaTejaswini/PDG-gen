// Working program with FastReader 
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
  public static void precisionCompute(int x, int y) 
    { 
        // Base cases 
        if (y == 0) { 
            System.out.print("Infinite"); 
        } 
        if (x == 0) { 
            System.out.print("0"); 
        } 
        // Handling negative numbers 
        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) { 
            System.out.print("-"); 
            x = x > 0 ? x : -x; 
            y = y > 0 ? y : -y; 
        } 
  
        // Integral division 
        int d = x / y; 
  
        // Now one by print digits after dot 
        // using school division method. 
        for (int i = 0; i <= 2; i++) { 
            System.out.print(d); 
            x = x - (y * d); 
            if (x == 0) 
                break; 
            x = x * 10; 
            d = x / y; 
            if (i == 0) 
                System.out.print("."); 
        } 
    } 
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader();
      int d=s.nextInt();
      int t=s.nextInt();
      int m=s.nextInt();
      float f= precisionCompute(d,m);
      if(f<=t)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}