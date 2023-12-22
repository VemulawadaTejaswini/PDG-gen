import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    int wrong =0,count =0;
    char [] number = new char[10];
    char c = '0';
    for (int i = 0; i <10 ; i++){
      number[i] = c++;
    }
    if (S.charAt(A) == '-') {
      for (int i=0; i<S.length(); i++) {
        for (int j=0; j<10; j++) {
          if (S.charAt(i) == number[j]) count++;
        }
      }
    }   
    if(count == S.length() -1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}