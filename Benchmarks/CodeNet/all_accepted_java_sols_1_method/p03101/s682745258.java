import java.util.*;
public class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int h = scan.nextInt();
  int w = scan.nextInt();
  int hDelete = scan.nextInt();
  int wDelete = scan.nextInt();
   
  System.out.println((h - hDelete)*(w - wDelete));
 }
}