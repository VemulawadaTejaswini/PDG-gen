import java.util.*;
public class Main {
  public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] l = new int[n];
       for(int i = 0; i < n ; i++){
           l[i] = scan.nextInt();
       }
        for (int i = l.length - 1; i >= 0; i--) {
            System.out.print(l[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
        System.out.println();
  }
}
