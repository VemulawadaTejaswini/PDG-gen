import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    int cnt = 0;
    for(int i = 0;i<s.length;i++){
      if(s[i].equals("2")){
        cnt++;
      }
    }
    System.out.println(cnt);
  } 
}