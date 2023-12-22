import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong(), D=sc.nextLong(), t=0, a,b,d;
    D*=D;
    for(int i=0; i<N; i++){
      a=sc.nextLong();
      b=sc.nextLong();
      d = a*a +b*b;
      if(d<=D) t++;
    }
    System.out.println(t);
  }
}