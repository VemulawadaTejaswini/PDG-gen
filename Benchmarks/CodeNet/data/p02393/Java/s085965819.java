import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    for(int i = 0; i < 3; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    while(true){
      if(a[0] <= a[1] && a[1] <= a[2]){
        break;
      }
      if(a[0] > a[1]){
        int c = a[1];
        a[1] = a[0];
        a[0] = c;
      }
      if(a[1] > a[2]){
        int c = a[2];
        a[2] = a[1];
        a[1] = c;
      }
    }
    System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
  }
}
