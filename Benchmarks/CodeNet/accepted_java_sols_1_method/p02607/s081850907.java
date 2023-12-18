import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
   
    int count=0;
    for(int i=1;i<=N;++i) {
      int a=sc.nextInt();
      if(a%2==1&&i%2==1)
        count++;
    }
    System.out.println(count);
    
  }
}