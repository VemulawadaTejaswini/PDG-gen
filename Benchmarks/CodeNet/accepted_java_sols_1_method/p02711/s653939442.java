import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int a,b,c;
    
    a = N / 100;
    b = (N - a*100) / 10;
    c = N - a*100 - b*10;
    
    if(a == 7 || b == 7 || c == 7){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
  
}