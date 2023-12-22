import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = s.substring(n/2);
    String ans = "";
    //System.out.println(t);
    if(s.startsWith(t)&&(n%2==0)){
      ans = "Yes";
    }else{
      ans = "No";
    }
    System.out.println(ans);
  }
}