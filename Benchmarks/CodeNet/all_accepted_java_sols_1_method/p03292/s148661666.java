import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A1 = sc.nextInt();
    int A2 = sc.nextInt();
    int A3 = sc.nextInt();    

    int max = Math.max(A3,Math.max(A1,A2));
    int min = Math.min(A3,Math.min(A1,A2));

    System.out.println(max-min);
      }
}
