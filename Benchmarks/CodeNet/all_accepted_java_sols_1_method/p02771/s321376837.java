import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a==b&&a!=c)||(b==c&&a!=b)||(c==a&&a!=b)){
        System.out.println("Yes");
        return;
    }
    System.out.println("No");
  }
  

  
}
