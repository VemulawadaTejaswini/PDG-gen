import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r =sc.nextInt(),g=sc.nextInt(),b=sc.nextInt();
    int num = 100*r + 10*g +b;
    if(num%4==0){
     System.out.println("YES"); 
    }else{
      System.out.println("NO");
    }
  }
}