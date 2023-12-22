import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int sum = 0;
    char[] C = N.toCharArray();
    for(char c : C) {
      sum += Character.getNumericValue(c);
    }
    String ans = "No";
    if(sum % 9 == 0) ans = "Yes";
    System.out.println(ans);
  }
}