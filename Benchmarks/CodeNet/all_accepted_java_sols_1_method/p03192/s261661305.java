import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int count=0;
    char[] B = A.toCharArray();
    for(int i=0;i<A.length();i++){
      if(B[i]=='2'){
      	count++;
      }
    }
    System.out.println(count);
  }
}

