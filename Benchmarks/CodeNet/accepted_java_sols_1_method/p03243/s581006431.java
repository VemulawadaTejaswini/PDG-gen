import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n;i<1000;i++){
      String s = String.valueOf(i);
      s = s.replace(s.substring(0,1),"");
      if(s.length()==0){
        System.out.println(i);
        return;
      }
    }
  }
}
