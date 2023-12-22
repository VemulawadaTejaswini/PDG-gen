import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    long a = stdId.nextLong(); 
    long b = stdId.nextLong(); 
    long d,r;
    double f;
    d = a/b;
    r = a%b;
    f = (double)a/b;
    System.out.printf("%d %d %f\n",d,r,f);
  }
}