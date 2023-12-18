import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
    for(int i = 0; i < 6; i++){
      a[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int b = sc.nextInt();
      int c = sc.nextInt();
      if((b == a[1] && c == a[2]) || (b == a[2] && c == a[4]) || (b == a[4] && c == a[3]) || (b == a[3] && c == a[1] )){
        System.out.println(a[0]);

      }else if((b == a[2] && c == a[1]) || (b == a[4] && c == a[2]) || (b == a[3] && c == a[4]) || (b == a[1] && c == a[3] )){
        System.out.println(a[5]);

      }else if((b == a[0] && c == a[3]) || (b == a[3] && c == a[5]) || (b == a[5] && c == a[2]) || (b == a[2] && c == a[0] )){
        System.out.println(a[1]);

      }else if((b == a[3] && c == a[0]) || (b == a[5] && c == a[3]) || (b == a[2] && c == a[5]) || (b == a[0] && c == a[2] )){
        System.out.println(a[4]);

      }else if((b == a[0] && c == a[1]) || (b == a[1] && c == a[5]) || (b == a[5] && c == a[4]) || (b == a[4] && c == a[0] )){
        System.out.println(a[2]);

      }else{
        System.out.println(a[3]);
      }
    }
  }
}
