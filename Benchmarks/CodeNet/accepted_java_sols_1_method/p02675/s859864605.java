import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int n = a%10;
    String name = "";
    
    if (n==2 || n==4 || n==5 || n==7 || n==9) {
      name = "hon";
    } else if (n==0 || n==1 || n== 6 || n==8) {
      name = "pon";
    } else {
      name = "bon";
    }
    

    System.out.println(name);
  }
}