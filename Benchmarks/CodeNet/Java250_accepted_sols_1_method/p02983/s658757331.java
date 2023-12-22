import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong(); 
    long R = sc.nextLong(); 

    long min = 2019;
    if(R-L>=2018){
      System.out.println(0);
      return;
    }
    for(long i=L; i<R;i++){
      // System.out.println(i);
      for(long j=i+1; j<=R;j++){
        // System.out.println(i+"aaa");
        min = Math.min((i*j)%2019, min);
     }
    }
    System.out.println(min);
  }
}

