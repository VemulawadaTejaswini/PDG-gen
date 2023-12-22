import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int i = 0;
    int cnt = 0;
    
    do{
      i = s.indexOf("ABC", i);
      if(i != -1){
        cnt++;
        i++;
      }
    }while(i >= 0);
    
    System.out.println(cnt);
  }
}