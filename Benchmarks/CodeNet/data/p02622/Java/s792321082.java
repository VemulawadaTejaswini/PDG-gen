import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String b = sc.next();
    
    char[] A = new char[a.length()];
    for(int i =0; i< a.length(); i++){
      A[i]=a.charAt(i);
    }
    char[] B = new char[a.length()];
    for(int i =0; i< a.length(); i++){
      B[i]=b.charAt(i);
    }
    
    int num=0;
    for (int i =0; i< a.length(); i++){
      if (A[i]!=B[i]) {
        num = num + 1;
      }
    }
    System.out.println(num);
  }
}