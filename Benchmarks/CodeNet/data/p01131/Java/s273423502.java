import java.util.*;
import java.io.*;

public class Main{

  char[][] mojiss = {
    {'\0'},
    {'.', ',', '!', '?', ' '},
    {'a', 'b', 'c'},
    {'d', 'e', 'f'},
    {'g', 'h', 'i'},
    {'j', 'k', 'l'},
    {'m', 'n', 'o'},
    {'p', 'q', 'r', 's'},
    {'t', 'u', 'v'},
    {'w', 'x', 'y', 'z'}
  };

  Main(){
    try {
      File f = new File("input1.txt");
      FileReader in = new FileReader(f);
    //Scanner in = new Scanner(System.in);
      int n;
      char c;
      int i = -1;
      int buf = 9999;
      while((n = in.read()) != -1) {
        c = (char)n;
        if (c == '\n') {
          System.out.println();
          continue;
        }
        n = Character.getNumericValue(c);
        //System.out.println(n);
        if(n == 0) {
          if(i != -1)
            System.out.printf("%c", mojiss[buf][i]);
          i = -1;
        } else {
          i++;
          if (i >= mojiss[n].length){
            i = 0;
          }
        }
        buf = n;
      }
      //System.out.println(mojiss[n][i]);
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e);//throw e;
    } catch(IOException e) {
      System.out.println("Error: " + e);//throw e;
    }
  }

  public static void main(String[] args) {
    new Main();
  }

}