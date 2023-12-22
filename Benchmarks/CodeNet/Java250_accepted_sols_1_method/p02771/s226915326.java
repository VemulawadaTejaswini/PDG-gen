import java.util.*;
    public class Main{//Main
          public static void main(String[] args){
             Scanner scanner = new Scanner(System.in);
              int A = scanner.nextInt();
              int B = scanner.nextInt();
              int C = scanner.nextInt();
              if(A==B){
                             if(B==C) System.out.println("No");
                             else System.out.println("Yes");
               }
              else if(A==C){
                             if(B==C) System.out.println("No");
                             else System.out.println("Yes");
               }
              else if(B==C){
                             if(A==C) System.out.println("No");
                             else System.out.println("Yes");
               }
              else System.out.println("No");
}
}
