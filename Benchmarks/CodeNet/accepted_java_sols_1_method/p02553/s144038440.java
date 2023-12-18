import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    long d = scan.nextLong();
    long max = 0;
    
    if(b<=0 && d<=0){
      System.out.println(a*c);
    }else if(a>=0 && c>=0){
      System.out.println(b*d);
    }else if(b<=0 && c>=0){
      System.out.println(b*c);
    }else if(a>=0 && d<=0){
      System.out.println(a*d);
    }else{
      long ac = a*c;
      long bd = b*d;
      if(ac >= bd){
        System.out.println(ac);
      }else{
        System.out.println(bd);
      }
    }
    
  }
}
    