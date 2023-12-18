import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int cnt = 0;
         
          if(S.equals("SSS")) {
            cnt = 0;
          } else if (S.equals("SSR") || S.equals("RSS") || S.equals("SRS")) {
            cnt = 1;
          } else if (S.equals("SRR") || S.equals("RRS") || S.equals("RSR")) {
            cnt = 2;
          } else if (S.equals("RRR")) {
            cnt = 3;
          }
     
     System.out.println(cnt);
     sc.close();
   }
}