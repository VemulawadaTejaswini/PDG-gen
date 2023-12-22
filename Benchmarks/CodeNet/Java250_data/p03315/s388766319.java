import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    
    for(int j = 0; j < 4; j++){
      if(s.charAt(j) == '+')
        count++;
      else
        count--;
    }
    System.out.println(count);
  }
}
