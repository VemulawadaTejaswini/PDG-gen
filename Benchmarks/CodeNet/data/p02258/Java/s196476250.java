import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[]args){
        InputReader sc = new InputReader(System.in);
  
        int n = sc.nextInt();
        
        int[] R = new int[n]; //kakaku list
        int[] P = new int[n-1]; //profit list
        
        
        for(int i=0;i<n;i++){
            R[i] = sc.nextInt();
        }
        
        int minR = 0;
        for(int i = 0; i<n-1; i++){
            
            if(i == 0){
                minR = R[i];
                P[i] = R[1]-R[0];
                for(int j=i+1; j<n; j++){
                    if( P[i]<(R[j]- R[i]) ){
                        P[i] = R[j]-R[i];
                    }
                }
            }else if(minR>R[i]){ 
                minR = R[i];
                P[i] = R[i+1]-R[i];
                for(int j=i+1; j<n; j++){
                    if( P[i]<(R[j]- R[i]) ){
                        P[i] = R[j]-R[i];
                    }
                }
            }else{
                P[i] = -999999999;
            }
            
        }
        
        /*System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(R[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(P[i]);
        }*/
        
        System.out.println(findmax(P));
    }
    
    static int findmax(int[] x){
        int max=0;
        for(int i = 0;i<x.length;i++){
            if(i == 0){
                max = x[i];
            }else{
                max = Math.max(max, x[i]);
            }
            
        }
        return max;
    }   
    
    static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;
 
      public InputReader(InputStream stream) {
          this.stream = stream;
      }
  
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
  
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }
 
      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }
  
      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
  
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}