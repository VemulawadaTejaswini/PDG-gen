import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    int start = 0;
    int end =0;
    for(int i=0; i<s.length; i++){
      if(s[s.length-1-i].equals("A")){
        start = s.length-1-i;
      }
      if(s[i].equals("Z")){
        end = i;
      }
    }
    System.out.println(end - start + 1);
  }
}