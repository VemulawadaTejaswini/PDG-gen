import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String ans = "No";
    if(n%2==0){
      ans = "Yes";
      int half = n/2;
      for(int i=0; i<half; ++i){
        if(s.charAt(i) != s.charAt(i+half))
          ans = "No";
      }
    }
    System.out.println(ans);
  }
}
