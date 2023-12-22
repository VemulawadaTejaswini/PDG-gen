import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] sh = s.toCharArray();
    int n = sh.length;
    int res = 0;
    for(int i = 0; i < n / 2; i++){
      if(!(sh[i] == sh[n - 1 - i])) res++;
    }
    System.out.print(res);
  }
}