import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i  = a; i <= b; i++){
      int i0 = (i/10000);
      int i1 = (i/1000)%10;
      int i3 = (i/10)%10;
      int i4 = i%10;
      if( i0 == i4){
        if ( i1 == i3){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}