import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i = a;i<=b;i++){
      String s = String.valueOf(i);
      if(s.substring(0,1).equals(s.substring(4,5)) && s.substring(1,2).equals(s.substring(3,4))){
        count++;
      }
    }
    System.out.println(count);
  }
}
