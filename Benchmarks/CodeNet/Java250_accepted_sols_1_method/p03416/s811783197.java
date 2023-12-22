import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    
    for(int i=a ; i<=b ; i++){
      int a1 = i/1000;
      int a11 = a1/10;
      int a12 = a1%10;
      
      int b1 = (i%1000)%100;
      int b11 = b1/10;
      int b12 = b1%10;
      
      if( (a11==b12) && (a12==b11) ){
        sum++;
      }
    }
    System.out.println(sum);
  }
}