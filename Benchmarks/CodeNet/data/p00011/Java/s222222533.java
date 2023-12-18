import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int[] num = new int[w];
    for(int i = 0; i < w; i++) {
      num[i] = i+1;
    }
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      String str = sc.next();
      int a = (int)(str.charAt(0)-'0');
      int b = (int)(str.charAt(2)-'0');
      int wk = num[a-1];
      num[a-1] = num[b-1];
      num[b-1] = wk;
    }
    for(int i = 0; i < w; i++) {
      System.out.println(num[i]);
    }
  }
}