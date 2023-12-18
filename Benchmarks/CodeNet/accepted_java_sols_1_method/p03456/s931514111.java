import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int v = Integer.valueOf(a+b);
    int count = 0;
    for(int i=1;i<v/2;i++) {
      if(i*i == v) {
        count++;
      } 
    }
    String ans = (count>0) ? "Yes" : "No";
    System.out.println(ans);
    }
    }
  
