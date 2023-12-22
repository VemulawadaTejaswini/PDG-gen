import java.util.Scanner;

public class Main {
  private static char alphabet[]={'a'};
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      String s=sc.next();
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c=(int)(s.charAt(i)+n)>90?(char)(s.charAt(i)+n-26):(char)(s.charAt(i)+n);
        sb.append(c);
      }
      System.out.println(sb.toString());
    }
}
