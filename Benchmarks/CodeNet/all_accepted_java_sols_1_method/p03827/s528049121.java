import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int max = 0, count = 0;
    for(int i = 0; i < n; i++){
        if ('I' == s.charAt(i)) count++;
        else count--;
        max = count > max ? count : max;
    }
    System.out.println(max);
  }
}