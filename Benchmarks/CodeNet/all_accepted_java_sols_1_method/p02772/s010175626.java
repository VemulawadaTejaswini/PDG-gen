import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int a;
    int i;
    for(i = 0; i < n; i++){
      a = sc.nextInt();
      if(a % 2 == 0){
        if(a % 3 == 0 || a % 5 == 0){
          
        }
        else
        {
          break;
        }
      }
    }
    if(i == n){
      System.out.println("APPROVED");
    }
    else
    {
      System.out.println("DENIED");
    }
  }
}