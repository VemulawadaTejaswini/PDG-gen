import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	String sa[] = sc.next().split("");
    int count = 0;
    int max = 0;
    for (String s : sa) {
       if ("ACGT".indexOf(s) != -1) {
         count++;
       } else {
         count = 0; 
       }
       if (count >= max) { 
         max = count;
       }
    }
    System.out.println(max);
  }
}