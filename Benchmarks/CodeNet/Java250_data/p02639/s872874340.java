import java.util.Scanner;
public class Main{
 public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
   int a[] = new int[5];
    a[0] = stdIn.nextInt();
    a[1] = stdIn.nextInt();
    a[2] = stdIn.nextInt();
    a[3] = stdIn.nextInt();
    a[4] = stdIn.nextInt();
     if (a[0] == 0) {
       System.out.println("1");
     }
     if (a[1] == 0) {
       System.out.println("2");
     }
     if (a[2] == 0) {
       System.out.println("3");
     }
     if (a[3] == 0) {
       System.out.println("4");
     }
     if (a[4] == 0) {
      System.out.println("5");
     }
 }
}