import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextLong();
    long count =2;
    int i=0;
    while(n >=count){
      if(n%count==0) {
        n/=count;
        i++;
      }
      count++;
    }
    System.out.println(i);
  }
}
        