import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;

 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    String[] cards = new String[n];
    String[] bubble = new String[n];
    String[] choice = new String[n];
    for(int i = 0; i < n; i++){
      cards[i] = sc.nextStr();
      bubble[i] = cards[i];
      choice[i] = cards[i];
    }

    boolean flag = true;
    while(flag){
      flag = false;
      for(int i = 0; i < n-1; i++){
        if(bubble[i].charAt(1) > bubble[i+1].charAt(1)){
          flag = true;
          String keep = bubble[i];
          bubble[i] = bubble[i+1];
          bubble[i+1] = keep;
        }
      }
    }

    for(int i = 0; i < n; i++){
      char nowmin = choice[i].charAt(1);
      int minind = i;
      for(int j = i+1; j < n; j++){
        if(nowmin > choice[j].charAt(1)){
          nowmin = choice[j].charAt(1);
          minind = j;
        }
      }
      String keep = choice[i];
      choice[i] = choice[minind];
      choice[minind] = keep;
    }

    boolean[] bubblecheck = new boolean[n];
    boolean[] choicecheck = new boolean[n];
    for(int i = 0; i < n; i++){
      bubblecheck[i] = true;
      choicecheck[i] = true;
    }

    boolean bubblestable = true;
    boolean choicestable = true;

    for(int i = 0; i < n; i++){
      char nowmark = cards[i].charAt(0);
      char nownum = cards[i].charAt(1);
      for(int j = 0; j < n; j++){
        if(bubblecheck[j] && nownum == bubble[j].charAt(1)){
          bubblecheck[j] = false;
          if(nowmark != bubble[j].charAt(0)){
            bubblestable = false;
          }
          break;
        }
      }
      for(int j = 0; j < n; j++){
        if(choicecheck[j] && nownum == choice[j].charAt(1)){
          choicecheck[j] = false;
          if(nowmark != choice[j].charAt(0)){
            choicestable = false;
          }
          break;
        }
      }      
    }

    for(int i = 0; i < n-1; i++){
      System.out.print(bubble[i]);
      System.out.print(" ");
    }
    System.out.println(bubble[n-1]);
    System.out.println(bubblestable ? "Stable" : "Not Stable");

    for(int i = 0; i < n-1; i++){
      System.out.print(choice[i]);
      System.out.print(" ");
    }
    System.out.println(choice[n-1]);
    System.out.println(choicestable ? "Stable" : "Not Stable");

  }
 
  
// LinkedList<Integer>[] setsu = new LinkedList[n];
// for(int i = 0; i < n; i++){
//   setsu[i] = new LinkedList<Integer>();
// } 

 //ここからテンプレ
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