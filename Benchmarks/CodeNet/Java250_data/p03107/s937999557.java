import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");

    int count_red  =0;
    int count_blue =0;

    for(int i=0; i<s.length; i++){
      if(s[i].equals("0")){
        count_red += 1;
      }else if(s[i].equals("1")){
        count_blue += 1;
      }
    }

    int ans = Math.min(count_red,count_blue)*2;

    System.out.println(ans);
  }
}