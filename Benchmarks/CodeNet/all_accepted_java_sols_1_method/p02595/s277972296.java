import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long d = sc.nextLong();


    int count = 0;//

    long x = 0;
    long y = 0;

    for(int i=0; i<n; i++){
      x = sc.nextLong();
      y = sc.nextLong();
      if(x*x+y*y<=d*d){count++;}
    }

    System.out.println(count);
  }
}