import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] b = a.toCharArray();
    int start = 0;
    int end  = a.length() - 1;
    int ans = 0;
    while(start < end){
      if(b[start] != b[end]){
        ans++;
      }
      start++;
      end--;   
    }
    System.out.println(ans);
  }
}