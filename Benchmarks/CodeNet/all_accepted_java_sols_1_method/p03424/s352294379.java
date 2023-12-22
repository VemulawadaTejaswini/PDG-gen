import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String [n];
    int flag = 0;
    for(int i = 0;i < n;i++){
      s[i] = sc.next();
      if(s[i].equals("Y")){
        flag = 1;
      }
    }
    if(flag == 1){
      System.out.println("Four");
    }else{
      System.out.println("Three");
    }
  }
}