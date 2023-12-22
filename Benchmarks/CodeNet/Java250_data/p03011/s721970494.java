import java.util.Scanner;

class Main {
 
    //https://atcoder.jp/contests/abc129/tasks/abc129_a
    public static void main( String[] args ) {
      try{
        Scanner scanner = new Scanner(System.in);
 
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
 
        System.out.println(Math.min(a + b, Math.min(b + c, c + a)));
      } catch(Exception e){
      return;
      }
    }
}