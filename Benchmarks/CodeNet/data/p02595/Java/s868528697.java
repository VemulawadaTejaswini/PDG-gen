import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long d = sc.nextLong();
    long count = 0;
    for(int i = 0;i < num;i++){
      long p = sc.nextLong();
      long q = sc.nextLong();
      long dis = p * p + q * q;
      if(dis <= d * d){
        count++;
      }
    }
    System.out.println(count);
  }
}