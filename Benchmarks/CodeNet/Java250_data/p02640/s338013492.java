import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Integer count = scan.nextInt();
    Integer legs = scan.nextInt();
    
    int turu;
    int kame;
    kame = (legs-(count*2))/2;
    turu = count-kame;
    int total = 2*turu + 4*kame;
        
    if(turu>=0&&kame>=0&&total==legs){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

