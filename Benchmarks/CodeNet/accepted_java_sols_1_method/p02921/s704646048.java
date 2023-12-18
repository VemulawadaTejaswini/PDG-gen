import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String r = sc.next();
    String t = sc.next();
    int answer =0;
    for(int i=0;i<3;i++){
      if(r.charAt(i)==(t.charAt(i))){
        answer=answer+1;
      }
    }
    System.out.println(answer);
      
  }
}