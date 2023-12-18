import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    int a = stdId.nextInt(); 
    int b = stdId.nextInt(); 
    int d,r;
    double f;
    d = a/b;
    r = a%b;
    f = (double)a/b;
    System.out.println(d+" "+r+" "+f);
  }
}