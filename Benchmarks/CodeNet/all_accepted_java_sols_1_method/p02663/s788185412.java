import java.util.*;
public class Main {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int h1,m1,h2,m2,k;
     h1=sc.nextInt();
     m1=sc.nextInt();
     h2=sc.nextInt();
     m2=sc.nextInt();
     k=sc.nextInt();
     System.out.println((60-m1)+m2+(h2-h1-1)*60-k);
  }
}