import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    while(n != 0){
      if(n % 10 == 7){
        break;
      }
      else{
        n = n / 10;
      }
    }
    if(n != 0){
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}