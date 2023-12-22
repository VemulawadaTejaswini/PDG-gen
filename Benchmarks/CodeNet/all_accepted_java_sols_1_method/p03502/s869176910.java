import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int fX = 0;
    int quo = x;
    while(quo != 0){
      fX += quo%10;
      quo = quo/10;
    }
    if(x%fX != 0){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}