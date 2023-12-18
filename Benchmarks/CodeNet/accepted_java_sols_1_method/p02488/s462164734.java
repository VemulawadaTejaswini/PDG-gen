import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str1, str2 = "zzzz";
    int c;

    for(int i = 0; i < n; i++){
      str1 = sc.next();
      c = str2.compareTo(str1);
      if(c > 0){
        str2 = str1;
      }
    }

    System.out.println(str2);
  }
}