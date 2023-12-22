import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String K = sc.next();
    K = K.replaceAll("ABC","");
    System.out.println((N - K.length()) / 3);
    }
  }
