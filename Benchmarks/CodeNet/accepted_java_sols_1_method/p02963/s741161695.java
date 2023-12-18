import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long y = ((long)Math.pow(10,18)-s)%1000000000;
    long x = (s+y)/1000000000;
    System.out.println(0+" "+0+" "+x+" "+y+" "+1+" "+1000000000);
  }
}