import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  for(int i = 0;;i++){
    if(N<Math.pow(2,i)){
      System.out.println((int)Math.pow(2,i-1));
      break;
    }
  }
}}