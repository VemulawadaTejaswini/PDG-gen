import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
 
    int h,m,s;
    h = input/3600;
    input = input-h*3600;
    m = input/60;
    input = input-m*60;
    s = input;
 
   System.out.println(h+":"+m+":"+s);
  }
}