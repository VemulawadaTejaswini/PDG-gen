import java.io.*;
public class Main{
  public static void main(String args[]) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    int pos = -1;
    
    for(int next; (next = isr.read()) != ' '; pos = next);
    if((pos & 1) == 0){
      System.out.println("Even");
      return;
    }
    
    for(int next; (next = isr.read()) != '\n'; pos = next);
    if((pos & 1) == 0){
      System.out.println("Even");
      return;
    }
    
    System.out.println("Odd");
  }
}