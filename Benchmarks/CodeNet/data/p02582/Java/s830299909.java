import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] T = {"SSS"};
        String[] U = {"SSR","SRS","RSS"};
        String[] V = {"SRR","RRS","RSR"};
        String[] W = {"RRR"};
     
        int a=0, b=1, c=2, d=3;
        
     
        //sec--2 (branch)
          if(S.equals(T)) {
            System.out.println(a);
          } else if (S.equals(U)) {
            System.out.println(b);
          } else if (S.equals(V)) {
            System.out.println(c);
          } else if (S.equals(W)) {
            System.out.println(d);
          }
     
        }        
}