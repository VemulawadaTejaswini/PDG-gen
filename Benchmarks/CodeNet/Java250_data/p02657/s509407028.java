import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int A,B;
      String an = scan.nextLine();
      String atai[] = an.split(" ",0);
      A = Integer.parseInt(atai[0]);
      B = Integer.parseInt(atai[1]);
       //System.out.println(N);
      cal(A,B);
        scan.close();
    }
  
  public static void cal(int a,int b){
   int s = 0;
    s = a*b;
    System.out.println(s);
    return;
  }
}