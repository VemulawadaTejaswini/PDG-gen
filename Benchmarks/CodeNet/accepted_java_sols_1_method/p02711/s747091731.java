import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i=2;i>=0;i--){
      if(x/(int)(Math.pow(10,(double)i))==7){
         System.out.println("Yes");
         break;
      }
      if(i==0)
         System.out.println("No");
      x%=(int)(Math.pow(10,(double)i));
    }
  }
}