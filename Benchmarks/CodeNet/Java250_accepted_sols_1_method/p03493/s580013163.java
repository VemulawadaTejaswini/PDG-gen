import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    int ans = 0;
      
      for(String s : S){
        if(s.equals("1")){
        	ans++;
        }
      }
    System.out.println(ans);
  }
}