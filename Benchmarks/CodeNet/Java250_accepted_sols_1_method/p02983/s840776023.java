import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    if(r-l>=2019){
      System.out.println(0);
      return;
    }
    long min = 2020l;
    for(int i = (int)l;i<(int)r;i++){
      for(int j = i + 1;j<=(int)r;j++){
        long ii = i % 2019;
        long jj = j % 2019;
        min = Math.min(min,(ii*jj)%2019);
      }
    }
    System.out.println(min);
  }
}
