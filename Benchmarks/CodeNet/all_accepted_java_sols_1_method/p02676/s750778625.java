import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt(); 
    String s = sc.next();
    int len = s.length();
    if(len <= k){
      System.out.println(s);
    }else{
    char[] a = s.toCharArray();
    for(int i = 0;i < k;i++){
      System.out.print(a[i]);
    }
    System.out.print("...");
    }
  }
}