import java.util.*;

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int Times = ((int)(T+0.5)/A);
      
     
      System.out.println(B*Times);
    }
}