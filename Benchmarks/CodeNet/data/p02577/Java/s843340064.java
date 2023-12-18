import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char c[] = sc.next().toCharArray();
    int n = 0;
    for(int i = 0; i < c.length; i++){
      n += c[i];
    }
    if(n%9==0){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }
}
