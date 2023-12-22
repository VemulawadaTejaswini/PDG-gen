import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 1;
    int ans =0;
    while(c<b){
    	c=c+(a-1);
      ans=ans+1;
    }
    System.out.println(ans);
  }
}