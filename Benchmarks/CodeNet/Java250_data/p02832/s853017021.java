import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] ar = new int[n];
    for (int i = 0; i < n; i++) {
      ar[i] = scan.nextInt();
    }

    int count = 1;
    boolean e = false;
    for (int i = 0; i < ar.length; i++) {
        if(ar[i] == count){
            e = true;
            count++;
        }
    }

    System.out.println(e?ar.length-count+1:-1);
  }
}