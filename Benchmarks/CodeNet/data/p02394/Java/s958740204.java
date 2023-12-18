import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int[] rec = new int[2];
    int[] cir = new int[3];

    rec[0] = sin.nextInt();
    rec[1] = sin.nextInt();

    cir[0] = sin.nextInt();
    cir[1] = sin.nextInt();
    cir[2] = sin.nextInt();

    if ( (rec[0] - cir[2]) >= cir[0] && cir[0] >= cir[2]
      && (rec[1] - cir[2]) >= cir[1] && cir[1] >= cir[2]){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }

    sin.close();
  }
}
