import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int start=s.nextInt();
    int end=s.nextInt();
    while(n-- >0){
      if(sum<=end){
        int val=Math.pow(start,2);
        start=val;
        sum+=val;
      }
    }
    System.out.println(sum);
   }
}
